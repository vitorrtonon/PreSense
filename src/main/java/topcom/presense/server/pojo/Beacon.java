package topcom.presense.server.pojo;

public class Beacon {

	private String id;
	private Person person;

	public Beacon() {}

	public Beacon(String id, Person person) {

		this.setId(id);
		this.setPerson(person);
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}
}
