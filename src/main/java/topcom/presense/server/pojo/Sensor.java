package topcom.presense.server.pojo;

public class Sensor {

	private long id;
	private int pin;
	private String passcode;
	private String name;
	private Event event;

	public Sensor() {}

	public Sensor(long id, int pin, String passcode, String name) {

		this.setId(id);
		this.setPin(pin);
		this.setPasscode(passcode);
		this.setName(name);
		this.setEvent(null);
	}

	public Sensor(long id, int pin, String passcode, String name, Event event) {

		this.setId(id);
		this.setPin(pin);
		this.setPasscode(passcode);
		this.setName(name);
		this.setEvent(event);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {

		return this.pin;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public String getPasscode() {
		return this.passcode;
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
