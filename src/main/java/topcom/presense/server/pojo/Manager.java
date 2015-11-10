package topcom.presense.server.pojo;

import java.util.*;

public class Manager {

	private String name;
	private String username;
	private String password;
	private String role;
	private List<Event> events;

	public Manager() {}

	public Manager(String name, String username, 
				String password) {

		this.setName(name);
		this.setUsername(username);
		this.setPassword(password);
		this.setEvents(null);
	}

	public Manager(String name, String username, 
				String password, List<Event> events) {

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

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole() {
		return this.role;
	}

	public void setEvents(List<Event> events) {
		
		if(events == null) events = new ArrayList<Event>();

		this.events = events;
	}

	public List<Event> getEvents() {
		return this.events;
	}
}
