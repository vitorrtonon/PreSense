package topcom.presense.server.pojo;

import java.sql.*;

public class Attendance {

	private long id;
	private Event event;
	private Person person;
	private Timestamp lastTime;
	private Timestamp totalTime;

	public Attendance() {}

	public Attendance(Event event, Person person, 
				Timestamp lastTime, Timestamp totalTime) {

		this.setId(id);
		this.setEvent(event);
		this.setPerson(person);
		this.setLastTime(lastTime);
		this.setTotalTime(totalTime);
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

	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}

	public Timestamp getLastTime() {
		return this.lastTime;
	}

	public void setTotalTime(Timestamp totalTime) {
		this.totalTime = totalTime;
	}

	public Timestamp getTotalTime() {
		return this.totalTime;
	}
}
