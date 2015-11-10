package topcom.presense.server;

import topcom.presense.server.pojo.*;
import topcom.presense.server.dao.*;
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
    public Auth authComm( @QueryParam("PIN") int pin) {
        // Identify sensor
        return new Auth("teste", "asdlajsdal");/*
        SensorDAO dS = new SensorDAO();
        Sensor s = dS.findSensorByPin(pin); 
        if (s == null) return null; // What should it return?
        // Create simple random password and encrypt it
        PassCode p = new PassCode();
        String passcode = p.generatePass(16, 32);
        String encPass = p.encryptPass(passcode);
        // Update sql ("consumes" PIN)
        s.setPasscode(encPass);
        s.setPin(-1);
        dS.update(s);
        // Answer to sensor
        return new Auth(s.getName(), passcode);*/
    }

     /**
     * Method handling HTTP POST requests. The received http-body will
     * contain a "application/json" media type
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)    
    @Produces(MediaType.TEXT_PLAIN)    
    @Path("alert")
    public String signalComm(ArrayList<Signal> recv) {
        
        // For test purpose
        String ret = "";

        for (Signal sign : recv) {
            ret += "User = " + sign.getUser() + " Passcode = " + sign.getPasscode();
            ret += "\n Um sensor será buscado por essas credenciais, pelo " +
            "qual se recuperará o evento\nInicia-se a leitura de alertas:\n";
            // Get json subobjects (alert list)
            ArrayList<Alert> evAlerts = new ArrayList<>(sign.getAlerts());
            for (Alert al : evAlerts) { // For each one...
                ret += "Beacon ID = " + al.getMinor() + al.getMajor() 
                        + al.getUuid();
                ret += "Timestamp = " + al.getTime();
                ret += "Signal kind = " + al.getKind();
            }
        }

        return ret;
        /*
        for (Signal sign : recv) {
            // Retrieve event using sensor's search
            EventDAO dEv = new EventDAO();
            Event ev = dEV.findEventById(1);
            SensorDAO dSens = new SensorDAO();
            //Event ev = dSens.findSensorByNameAndPass(sign.getUser(), 
            //                                  sign.getPass()).getEvent();
            if (ev == null) {
                System.err.println("Unregistered event");
                return "not ok";
            }
            // Get json subobjects (alert list)
            ArrayList<Alert> evAlerts = new ArrayList<>(sign.getAlerts());
            for (Alert al : evAlerts) { // For each one...
                if (!alertHandling(al, ev))  // Call handler
                    System.err.println("Error in json alert.");
            }
        }

        return "ok";*/
    }

    public boolean alertHandling(Alert recv, Event ev) {
        // Compose beacon ID
        String bId = recv.getMinor() + recv.getMajor() + recv.getUuid();
        
        // Convert time to miliseconds (later use) and Timestamp 
        String t[] = recv.getTime().split("[-] | [T] | [:] | [Z]");
        Calendar cal = Calendar.getInstance(); 
        cal.set(Integer.parseInt(t[0]), Integer.parseInt(t[1]),
                Integer.parseInt(t[2]), Integer.parseInt(t[3]), 
                Integer.parseInt(t[4]), Integer.parseInt(t[5]));
        Long timeMil = cal.getTimeInMillis();
        Timestamp curTime = new Timestamp(timeMil);

        // Retrieve person using beacon's search
        BeaconDAO dBeac = new BeaconDAO(); 
        Person p = dBeac.findBeaconById(bId).getPerson();
        if (p == null) {
            System.err.println("Unregistered person");
            return false;
        }
                
        // Search for Attendance, if doesn't exist, creat it
        AttendanceDAO dAtt = new AttendanceDAO();
        Attendance att = dAtt.findAttendanceByEventAndPerson(ev.getId(), p.getId());
        if (att == null) att = new Attendance(ev, p, new Timestamp(0), curTime);
        else {
            // Process rightful kind of signal
            if (recv.getKind().equals("in")) att.setLastTime(curTime);
            else if (recv.getKind().equals("update")) {
                long newTime = att.getTotalTime().getTime() + 
                            (timeMil - att.getLastTime().getTime());
                att.setTotalTime(new Timestamp(newTime));
                att.setLastTime(curTime);
            }
            else if (!recv.getKind().equals("out")) {
                System.err.println("Invalid communication kind");
                return false;
            }
            dAtt.update(att);
        }
        return true;
    }
}