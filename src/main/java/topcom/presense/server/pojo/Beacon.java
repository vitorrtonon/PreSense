package topcom.presense.server.pojo;

public class Beacon {

	private long id;
	private Person person;

	public Beacon() {}

	public Beacon(long id, Person person) {

		this.setId(id);
		this.setPerson(person);
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return this.id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}
}
