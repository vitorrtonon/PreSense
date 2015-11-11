package topcom.presense.server.pojo;

import java.util.*;

public class Signal {

	private ArrayList<Alert> alerts;
	private String user;
	private String pass;

	public Signal() {}

	public Signal(String user, String pass, ArrayList<Alert> alerts) {
		this.setUser(user);
		this.setPass(pass);
		this.setAlerts(alerts);
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAlerts(ArrayList<Alert> alerts) {
		this.alerts = new ArrayList<Alert>(alerts);
	}

	public String getUser() {
		return this.user;
	}

	public String getPass() {
		return this.pass;
	}
	
	public ArrayList<Alert> getAlerts() {
		return this.alerts;
	}

}
