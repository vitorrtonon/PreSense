package topcom.presense.server.pojo;

import java.util.*;

public class Manager {

	private String name;
	private String username;
	private String password;
	private ArrayList<Event> events;

	public Manager() {}

	public Manager(String name, String username, 
				String password, ArrayList<Event> events) {

		this.setName(name);
		this.setUsername(username);
		this.setPassword(password);
		this.setEvents(events);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return this.events;
	}
}
