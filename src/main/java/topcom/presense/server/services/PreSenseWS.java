package topcom.presense.server.services;

import topcom.presense.server.dao.*;
import topcom.presense.server.pojo.*;
import java.util.Calendar;
import java.sql.Timestamp;

public class PreSenseWS {

	// <delete later> 
	// TO-DO: usar lib json para leitura da entrada
	// TO-DO: lidar com a autentificação (pra extrair evento)
	public void receiveInfoFromSensor(byte[] resource) {

		// // < Fazer leitura Json>
		// if (/*HTTP GET*/) {
		// 	this.auth(/*stream*/);
		// 	return;
		// }
		// // else
		
		// String bId = /*getMajor + getMinor + getUuid*/;
		// String res[] = /*getTime*/.split("[-] | [T] | [:] | [Z]");
		// String user = /*getUser*/
		// String pass = /*getPass*/

		// // Convert time to Timestamp 
		// Calendar cal = Calendar.getInstance(); 
		// cal.set(Integer.parseInt(t[0]), Integer.parseInt(t[1]),Integer.parseInt(t[2]),
		// 		Integer.parseInt(t[3]), Integer.parseInt(t[4]), Integer.parseInt(t[5]));
		// Long time = cal.getTimeInMillis();
		
		// // Retrieve event using sensor's search
		// Event ev = EventDAO.findEventById(
		// 	/*SensorDao.findSensorByName(user, pass).getEvent());*/
		// if (ev == null) {
		// 	System.err.println("Unregistered event")
		// 	return;
		// }
		
		// // Retrieve person using beacon's search
		// Person p = BeaconDAO.findBeaconById().getPerson();
		// if (p == null) {
		// 	System.err.println("Unregistered person")
		// 	return;
		// }
				
		// // Search for Attendance, if doesn't exist, creat it
		// Attendance att = findAttendanceByEventAndPerson(e, p);
		// if (att == null) att = new Attendance(e, p, new Timestamp(0), new Timestamp(time));
		// else {
		// 	// Process rightful sensor-event type
		// 	if (type.equals("in")) att.setLastTime(time);
		// 	else if (type.equals("update")) {
		// 		Long delta = time - att.getLastTime.getTime();
		// 		att.setTotalTime(att.getTotalTime.getTime() + delta);
		// 		att.setLastTime(new Timestamp(time));
		// 	}
		// 	else if (type.equals("out")) {
		// 		continue;
		// 	}
		// 	else {
		// 		System.err.println("Invalid stream received");
		// 		return;
		// 	}
		// }
		
	}

	public void auth(void)   {
		// Verify PIN
		// Create passcode
		// Elaborate json response
		// Encrypt passcode and update sql
		// Send
	}


}
