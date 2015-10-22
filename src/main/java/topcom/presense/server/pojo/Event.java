package topcom.presense.server.pojo;

import java.sql.*;
import java.util.*;

public class Event {

	private long id;
	private String name;
	private Timestamp startDate;
	private Timestamp endDate;
	private ArrayList<Person> participants;
	private ArrayList<Manager> managers;
	private ArrayList<Sensor> sensors;

	public Event() {}

	public Event(long id, String name, Timestamp startDate, 
				Timestamp endDate, ArrayList<Person> participants, 
				ArrayList<Manager> managers, ArrayList<Sensor> sensors) {

		this.setId(id);
		this.setName(name);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(participants);
		this.setManagers(managers);
		this.setSensors(sensors);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setParticipants(ArrayList<Person> participants) {
		this.participants = participants;
	}

	public ArrayList<Person> getParticipants() {
		return this.participants;
	}

	public void setManagers(ArrayList<Manager> managers) {
		this.managers = managers;
	}

	public ArrayList<Manager> getManagers() {
		return this.managers;
	}

	public void setSensors(ArrayList<Sensor> sensors) {
		this.sensors = sensors;
	}

	public ArrayList<Sensor> getSensors() {
		return this.sensors;
	}
}
