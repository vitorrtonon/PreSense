package topcom.presense.server.pojo;

import java.sql.*;
import java.util.*;

public class Event {

	private long id;
	private String name;
	private Timestamp startDate;
	private Timestamp endDate;
	private Set<Person> participants;
	private Set<Manager> managers;
	private List<Sensor> sensors;

	public Event() {}

	public Event(long id, String name, Timestamp startDate, 
				Timestamp endDate) {

		this.setId(id);
		this.setName(name);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setParticipants(null);
		this.setManagers(null);
		this.setSensors(null);
	}

	public Event(long id, String name, Timestamp startDate, 
				Timestamp endDate, Set<Person> participants, 
				Set<Manager> managers, List<Sensor> sensors) {

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

	public void setParticipants(Set<Person> participants) {
	
		if(participants == null) participants = new HashSet<Person>();

		this.participants = participants;
	}

	public Set<Person> getParticipants() {
		return this.participants;
	}

	public void setManagers(Set<Manager> managers) {
	
		if(managers == null) managers = new HashSet<Manager>();

		this.managers = managers;
	}

	public Set<Manager> getManagers() {
		return this.managers;
	}

	public void setSensors(List<Sensor> sensors) {
	
		if(sensors == null) sensors = new ArrayList<Sensor>();

		this.sensors = sensors;
	}

	public List<Sensor> getSensors() {
		return this.sensors;
	}
}
