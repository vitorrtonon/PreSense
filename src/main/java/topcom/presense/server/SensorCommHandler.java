package topcom.presense.server;

import topcom.presense.server.pojo.*;
import topcom.presense.server.dao.*;
import topcom.presense.server.util.*;
import javax.ws.rs.QueryParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Calendar;
import java.sql.Timestamp;
import java.util.*;


@Path("api")
public class SensorCommHandler {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("auth")
    public Response authComm( @QueryParam("PIN") int pin) {
        // Identify sensor

        SensorDAO dS = new SensorDAO();
        Sensor s = dS.findSensorByPin(pin);
        /*List<Sensor> se = dS.findAllSensors();
        Sensor s = null;
        for (Sensor it : se) {
            if (it.getPin() == pin) {
                s = it;
            }
        }*/

        if (s == null)
            return Response.status(403).type("text/plain")
                .entity("PIN not found\n").build();  // Invalid access

        // Create simple random password and encrypt it
        PassCode p = new PassCode();
        String passcode = p.generatePass(16, 32);
        //String encPass = p.encryptPass(passcode);

        // Update sql ("consumes" PIN)
        s.setPasscode(passcode);
        s.setPin(-1);
        dS.update(s);

        // Answer to sensor
        return Response.ok(new Auth(s.getName(), passcode),
                                            MediaType.APPLICATION_JSON).build();
    }

     /**
     * Method handling HTTP POST requests. The received http-body will
     * contain a "application/json" media type
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("alert")
    public Response signalComm(Signal recv) {
        // Retrieve event using sensor's search
        EventDAO dEv = new EventDAO();
        SensorDAO dSens = new SensorDAO();
        //PassCode p = new PassCode();
        //Sensor s = dSens.findSensorByNameAndPass(recv.getUser(), recv.getPass());
        //List<Sensor> se = dSens.findAllSensors();
        Sensor s = dSens.findSensorById(1);
        // for (Sensor it : se) {
        //     if (it.getName().equalsIgnoreCase(recv.getUser()) && it.getPasscode().equals(recv.getPass())) {
        //         s = it;
        //         break;
        //     }
        // }
        if (s == null) {
            System.err.println("Unregistered sensor\n");
            return Response.status(403).type("text/plain")
                .entity("Sensor " + recv.getUser() + " " +
                                      recv.getPass() + "not found\n").build();
        }

        Event ev = s.getEvent();
        if (ev == null) {
            System.err.println("Unregistered event\n");
            return Response.status(403).type("text/plain")
                .entity("No associated event!\n").build();
        }

        // Get json subobjects (alert list)
        ArrayList<Alert> evAlerts = new ArrayList<>(recv.getAlerts());
        for (Alert al : evAlerts) { // For each one...
            if (!alertHandling(al, ev))  // Call handler
                System.err.println("Error in json alert.");
        }
        return Response.ok().build();
    }

    public boolean alertHandling(Alert recv, Event ev) {
        // Compose beacon ID
        String bId = recv.getMinor() + "-" + recv.getMajor() + "-" + recv.getUuid();

        // Convert time to miliseconds (later use) and Timestamp
        Timestamp curTime = Timestamp.valueOf(recv.getTime().replace('T', ' ').replace('Z', ' '));
        Long timeMil = curTime.getTime();

        // Retrieve person using beacon's search
        BeaconDAO dBeac = new BeaconDAO();
        Beacon b = dBeac.findBeaconById(bId);
        if (b == null) {
            System.err.println("Unregistered beacon");
            return false;
        }
        Person p = b.getPerson();
        if (p == null) {
            System.err.println("Unregistered person");
            return false;
        }

        // Search for Attendance, if doesn't exist, creat it
        AttendanceDAO dAtt = new AttendanceDAO();
        Attendance att = dAtt.findAttendanceByEventAndPerson(ev.getId(),
                                                             p.getId());
        if (att == null) {
            att = new Attendance(ev, p, curTime, new Timestamp(0));
            //Attendancebackup.getInstance().setTotal(new Timestamp(0));
            //Attendancebackup.getInstance().setLast(curTime);
            dAtt.insert(att);
        }
        // Process rightful kind of signal
        if (recv.getKind().equals("in")) {
            att.setLastTime(curTime);
            //Attendancebackup.getInstance().setLast(curTime);
        }
        else if (recv.getKind().equals("update")) {
            long newTime = att.getTotalTime().getTime() +
                        (timeMil - att.getLastTime().getTime());
            att.setTotalTime(new Timestamp(newTime));
            att.setLastTime(curTime);
            //Attendancebackup.getInstance().setTotal(new Timestamp(newTime));
            //Attendancebackup.getInstance().setLast(curTime);
        }
        else if (!recv.getKind().equals("out")) {
            System.err.println("Invalid communication kind");
            return false;
        }
        dAtt.update(att);
        return true;
    }
}
