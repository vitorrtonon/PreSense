package topcom.presense.server.pojo;

import java.util.*;

public class Person {

	private long id;
	private String name;
	private List<Event> events;
	private List<Beacon> beacons;
	private List<Attendance> attendances;

	public Person() {}

	public Person(long id, String name) {

		this.setId(id);
		this.setName(name);
		this.setEvents(null);
		this.setBeacons(null);
		this.setAttendances(null);
	}

	public Person(long id, String name, List<Event> events, 
			List<Beacon> beacons, List<Attendance> attendances) {

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

	public void setEvents(List<Event> events) {

		if(events == null) events = new ArrayList<Event>();

		this.events = events;
	}

	public List<Event> getEvents() {
		return this.events;
	}

	public void setBeacons(List<Beacon> beacons) {

		if(beacons == null) beacons = new ArrayList<Beacon>();

		this.beacons = beacons;
	}

	public List<Beacon> getBeacons() {
		return this.beacons;
	}

	public void setAttendances(List<Attendance> attendances) {

		if(attendances == null) attendances = new ArrayList<Attendance>();

		this.attendances = attendances;
	}

	public List<Attendance> getAttendances() {
		return this.attendances;
	}
}
