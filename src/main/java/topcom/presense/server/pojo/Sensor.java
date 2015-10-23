package topcom.presense.server.pojo;

public class Sensor {

	private long id;
	private String name;
	private Event event;

	public Sensor() {}

	public Sensor(long id, String name) {

		this.setId(id);
		this.setName(name);
		this.setEvent(null);
	}

	public Sensor(long id, String name, Event event) {

		this.setId(id);
		this.setName(name);
		this.setEvent(event);
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

	public void setEvent(Event event) {

		if(event == null) event = new Event();

		this.event = event;
	}

	public Event getEvent() {
		return this.event;
	}
}
