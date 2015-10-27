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
	// Necessário ainda: resolver questão do ID do beacon
	// TO-DO: verificar a busca por pessoa associada ao beacon (acima necessário)
	// Necessário ainda: identificação do evento associado a comunicação
	// TO-DO: lidar com campo evento nos campos comentados (acima necessário) 
	public void receiveInfoFromSensor(byte[] resource) {

		// Transforma cadeia de bytes em string (<correto?>)
		String[] res = (new String(byte)).split("[,] | [\n] | [ : ] | [\"]");
		int l = res.length;  
		if (l != 10 || l != 12) { // If a sensor message
			System.err.println("Invalid stream received");
			return;
		}

		if (l == 12) // If update or in (ps: Out has 10 tokens)
			double dist = Double.parseDouble(res[1]); 
		String[] time = res[l-3].split("[-] | [T] | [:] | [Z]"); 
		Timestamp new Timestamp(time[0], time[1], time[2], time[3], time[4], time[5], 0);	
		Person pers;
		
		/* // Search for the beacon's owner
		if ((pers = ?searchPerson(res[l-7] + res[l-5] + res[l-1])) == null)
		System.err.println("Unregistered beacon");
		*/
		
		// Process rightful sensor-event type 
		if (res[l-9].equals("in")) sensorIn(dist, tStamp, pers);
		else if (res[l-9].equals("update")) sensorUpdate(dist, tStamp, pers);
		else if (res[l-9].equals("out")) sensorOut(tStamp, pers);
		else System.err.println("Invalid stream received");
		
	}

	private void sensorIn(Timestamp t, Person p) {	
		/* 
		// Register new attendence for 'p' in 'event'
		?Attendance presence = new Attendance(?getEvent(), person, t, null);
		*/
	}

	private void sensorOut(Timestamp t, Person p) {
		/* 
		// Search for active attendence entry for 'p' in 'event,
		// then set a end to it 
		if ((presence = ?searchAttendance(event, p, "Departure == null")) != null)
			presence.setDepartureTime(new Timestamp());
		else // Else, some kind of error?
			System.err.println("Presence not found. Unknown error."); 
		*/
	}

	private void sensorUpdate(Timestamp t, Person p) {
		/*
		// Search for active attendence for 'p' in 'event'
		// if nothing is found, start a new attendance
		// (probably communication loss for 'in' message)
		if (?searchAttendance(event, p, "Departure == null") == null)
			sensorIn(d, t, p);
		*/

	}

}
