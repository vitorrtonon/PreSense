package topcom.presense.server.pojo;

import java.sql.*;

public class Attendance {

	private long id;
	private Event event;
	private Person person;
	private Timestamp entranceTime;
	private Timestamp departureTime;

	public Attendance() {}

	public Attendance(int id, Event event, Person person, 
				Timestamp entranceTime, Timestamp departureTime) {

		this.setId(id);
		this.setEvent(event);
		this.setPerson(person);
		this.setEntranceTime(entranceTime);
		this.setDepartureTime(departureTime);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Event getEvent() {
		return this.event;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Person getPerson() {
		return this.person;
	}

	public void setEntranceTime(Timestamp entranceTime) {
		this.entranceTime = entranceTime;
	}

	public Timestamp getEntranceTime() {
		return this.entranceTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	public Timestamp getDepartureTime() {
		return this.departureTime;
	}
}
