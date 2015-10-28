package topcom.presense.server.services;

import topcom.presense.server.dao.*;
import topcom.presense.server.pojo.*;
import java.util.Calendar;
import java.sql.Timestamp;
import com.google.gson.Gson;

public class PreSenseWS {

	// <delete later> 
	// TO-DO: usar lib json para leitura da entrada
	// TO-DO: lidar com a autentificação (pra extrair evento)
	public void receiveInfoFromSensor(byte[] resource) {
		// String res = new String(byte);
		// // < Fazer leitura Json>
		// Gson gson = new Gson();
		// Receiver recv = gson.fromJson(json, Receiver.class);
		// if (/*HTTP GET*/) {
		// 	this.auth(/*stream*/);
		// 	return;
		// }
		// // else
		
		// String bId = recv.getMajor + recv.getMinor + recv.getUuid;
		// String t[] = recv.getTime.split("[-] | [T] | [:] | [Z]");

		// // Convert time to Timestamp 
		// Calendar cal = Calendar.getInstance(); 
		// cal.set(Integer.parseInt(t[0]), Integer.parseInt(t[1]),Integer.parseInt(t[2]),
		// 		Integer.parseInt(t[3]), Integer.parseInt(t[4]), Integer.parseInt(t[5]));
		// Long time = cal.getTimeInMillis();
		
		// // Retrieve event using sensor's search
		// Event ev = EventDAO.findEventById(
		// 	/*SensorDao.findSensorByName(recv.getUser, recv.getPass).getEvent())*/;
		// if (ev == null) {
		// 	System.err.println("Unregistered event")
		// 	return;
		// }
		
		// // Retrieve person using beacon's search
		// Person p = BeaconDAO.findBeaconById(bId).getPerson();
		// if (p == null) {
		// 	System.err.println("Unregistered person")
		// 	return;
		// }
				
		// // Search for Attendance, if doesn't exist, creat it
		// Attendance att = findAttendanceByEventAndPerson(ev, p);
		// if (att == null) att = new Attendance(ev, p, new Timestamp(0), new Timestamp(time));
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
