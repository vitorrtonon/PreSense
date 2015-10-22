package topcom.presense.server.pojo;

import java.util.*;

public class Person {

	private long id;
	private String name;
	private ArrayList<Event> events;
	private ArrayList<Beacon> beacons;
	private ArrayList<Attendance> attendances;

	public Person() {}

	public Person(long id, String name, ArrayList<Event> events, 
			ArrayList<Beacon> beacons, ArrayList<Attendance> attendances) {

		this.setId(id);
		this.setName(name);
		this.setEvents(events);
		this.setBeacons(beacons);
		this.setAttendances(attendances);
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

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return this.events;
	}

	public void setBeacons(ArrayList<Beacon> beacons) {
		this.beacons = beacons;
	}

	public ArrayList<Beacon> getBeacons() {
		return this.beacons;
	}

	public void setAttendances(ArrayList<Attendance> attendances) {
		this.attendances = attendances;
	}

	public ArrayList<Attendance> getAttendances() {
		return this.attendances;
	}
}
