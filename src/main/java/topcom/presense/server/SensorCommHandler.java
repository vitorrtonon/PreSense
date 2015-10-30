package topcom.presense.server;

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
import java.security.MessageDigest;

/**
 * Root resource (exposed at "auth" path)
 */
@Path("auth")
public class SensorCommHandler {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Auth authComm() {
        @QueryParam("PIN") int pin;
        // Identify sensor
        Sensor s = SensorDao.findSensorByPIN(pin); 
        if (s == null) return null; // What should it return?
        // Create simple random password
        String passcode = PassCode.generatePass();
        // Encrypt it
        String encPass = PassCode.encrypticPass(passcode);
        // Update sql ("consumes" PIN)
        SensorDao.update(s.getId(), s.getName(), s.getEvent(), encPass, null);
        // Answer to senser
        return new Auth(s.getName(), passcode);
    }

     /**
     * Method handling HTTP POST requests. The received http-body will
     * contain a "application/json" media type
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)    
    public void signalComm(Signal recv) () {
        
        // Compose beacon ID
        String bId = recv.getMinor() + recv.getMajor() + recv.getUuid();
        
        // Convert time to miliseconds (later use) and Timestamp 
        String t[] = recv.getTime().split("[-] | [T] | [:] | [Z]");
        Calendar cal = Calendar.getInstance(); 
        cal.set(Integer.parseInt(t[0]), Integer.parseInt(t[1]),Integer.parseInt(t[2]),
                Integer.parseInt(t[3]), Integer.parseInt(t[4]), Integer.parseInt(t[5]));
        Long timeMil = cal.getTimeInMillis();
        Timestamp time = new Timestamp(timeMil);

        // Retrieve event using sensor's search
        Event ev = EventDAO.findEventById(
            SensorDao.findSensorByNameAndPass(recv.getUser(), recv.getPass()).getEvent());
        if (ev == null) {
            System.err.println("Unregistered event")
            return;
        }
        
        // Retrieve person using beacon's search
        Person p = BeaconDAO.findBeaconById(bId).getPerson();
        if (p == null) {
            System.err.println("Unregistered person")
            return;
        }
                
        // Search for Attendance, if doesn't exist, creat it
        Attendance att = findAttendanceByEventAndPerson(ev, p);
        if (att == null) att = new Attendance(ev, p, new Timestamp(0), time);
        else {
            // Process rightful kind of signal
            if (recv.getKind().equals("in")) att.setLastTime(time);
            else if (recv.getKind().equals("update")) {
                Long delta = timeMil - att.getLastTime().getTime();
                att.setTotalTime(att.getTotalTime.getTime() + delta);
                att.setLastTime(time);
            }
            else if (recv.getKind().equals("out")) {
                continue;
            }
            else {
                System.err.println("Invalid communication kind");
                return;
            }
        }
    }


    Private String generateRandomPassCode() {
        String pass = new String();

        private static final char[] symbols;

         static {
           StringBuilder tmp = new StringBuilder();
           for (char ch = '0'; ch <= '9'; ++ch)
             tmp.append(ch);
           for (char ch = 'a'; ch <= 'z'; ++ch)
             tmp.append(ch);
           symbols = tmp.toString().toCharArray();
         }   

         private final Random random = new Random();

         private final char[] buf;

         public RandomString(int length) {
           if (length < 1)
             throw new IllegalArgumentException("length < 1: " + length);
           buf = new char[length];
         }

         public String nextString() {
           for (int idx = 0; idx < buf.length; ++idx) 
             buf[idx] = symbols[random.nextInt(symbols.length)];
           return new String(buf);
         }
        return pass;
    }
}
