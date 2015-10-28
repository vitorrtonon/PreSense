package topcom.presense.server.services;

import topcom.presense.server.dao.*;
import topcom.presense.server.pojo.*;

public class PreSenseWS {

	// <delete later> 
	// Assumindo apenas comunicação de um evento e não para externo, 
	// como CRUD de eventos [que envolve calculos de preseça], de pessoas, 
	// beacons, managers ou sensores) -> Apenas lida com Attendance
	// Questão: Tratando attendance como a "presença" do ER, sendo 'atende'
	// apenas algo a ser computado após o encerramento do evento, não neste código.
	// Questão: Distância é necessária?
	// 
	// TO-DO: <?> buscar Attendance ativo (recebendo evento e pessoa, buscando
	// por um onde encerramento é NULL)
	// TO-DO: usar lib json para leitura da entrada
	// TO-DO: lidar com a autentificação (pra extrair evento)
	// >> Ultimos dois envolvem alteração dos valores de campos utilizados
	// nas buscas e instanciações
	//
	// Questão: Resource é a mensagem HTTP integra?
	public void receiveInfoFromSensor(byte[] resource) {

		// Trocar para uma leitura JSON?
		//String[] res = (new String(byte)).split("[,] | [\n] | [ : ] | [\"]");
		//int l = res.length;  
		//if (l != 10 || l != 12) { // If a sensor message 
		//	System.err.println("Invalid stream received");
		//	return;
		//}
		//if (l == 12) // If update or in (ps: Out has 10 tokens)
		//	double dist = Double.parseDouble(res[1]); 
		//String[] t = res[l-3].split("[-] | [T] | [:] | [Z]"); 

		// Convert time to Timestamp 
		//Calendar cal = Calendar.getInstance(); 
		//cal.set(Integer.parseInt(t[0]), Integer.parseInt(t[1]),Integer.parseInt(t[2]),
		//		Integer.parseInt(t[3]), Integer.parseInt(t[4]), Integer.parseInt(t[5]));
		//Timestamp t = new Timestamp(cal.getTimeInMillis());	
		
		// Retrieve event using sensor's search
		//Event ev = EventDAO.findEventById(SensorDao.findSensorById(1).getEvent());
		//if (ev == null) {
		//	System.err.println("Unregistered event")
		//	return;
		//}
		
		// Retrieve person using beacon's search
		//Person p = BeaconDAO.findBeaconById(res[l-7] + res[l-5] + res[l-1]).getPerson();
		//if (p == null) {
		//	System.err.println("Unregistered person")
		//	return;
		//}
				
		// Process rightful sensor-event type 
		//if (res[l-9].equals("in")) { // Register new attendence for 'p' in 'event'
		//	AttendanceDao.insert(new Attendance(ev, p, t, null));
		//} else if (res[l-9].equals("out")) {
			// Search for active attendence entry for 'p' in 'event,
		//	if ((presence = /*<TO-DO>?*/AttendanceDAO.findAttendance(event, p, null)) != null)
		//		presence.setDepartureTime(new Timestamp(System.currentTimeMillis()));
		//	else // Else, some kind of error?
		//		System.err.println("Presence not found. Unknown error."); 
		//} else if (res[l-9].equals("update")) {
		//	// Search for active attendence for 'p' in 'event', if nothing is found, 
			// start a new attendance (probably communication loss during 'in' message)
		//	if ((presence = /*<TO-DO>?*/AttendanceDAO.findAttendance(event, p, null)) == null)
		//		AttendanceDao.insert(new Attendance(ev, p, t, null));
		//} else System.err.println("Invalid stream received");
		
	}

}
