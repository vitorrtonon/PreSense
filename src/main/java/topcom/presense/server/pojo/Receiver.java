package topcom.presense.server.pojo;

import java.util.*;

public class Receiver {

	private Double distance;
	private String event;
	private String time;
	private String uuid;
	private String major;
	private String minor;
	private String user;
	private String pass;

	public Receiver() {}

	public Receiver(Double distance, String event, String time,
				String uuid, String major, String minor,
				String user, String pass) {

		this.setDistance(distance);
		this.setEvent(event);
		this.setTime(time);
		this.setUuid(uuid);
		this.setMajor(major);
		this.setMinor(minor);
		this.setUser(user);
		this.setPass(pass);
	}

	private void setDistance(Double distance) {
		this.distance = distance;
	}

	private void setEvent(String event) {
		this.event = event;
	}

	private void setTime(String time) {
		this.time = time;
	}

	private void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private void setMajor(String major) {
		this.major = major;
	}

	private void setMinor(String minor) {
		this.minor = minor;
	}

	private void setUser(String user) {
		this.user = user;
	}

	private void setPass(String pass) {
		this.pass = pass;
	}


	private Double getDistance() {
		return this.distance;
	}

	private String getEvent() {
		return this.event;
	}

	private String getTime() {
		return this.time;
	}

	private String getUuid() {
		return this.uuid;
	}

	private String getMajor() {
		return this.major;
	}

	private String getMinor() {
		return this.minor;
	}

	private String getUser() {
		return this.user;
	}

	private String getPass() {
		return this.pass;
	}

}
