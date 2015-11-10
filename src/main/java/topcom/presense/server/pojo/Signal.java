package topcom.presense.server.pojo;

import java.util.*;

public class Signal {

	private ArrayList<Alert> alerts;
	private String user;
	private String passcode;

	public Signal() {}

	public Signal(String user, String passcode, ArrayList<Alert> alerts) {
		this.setUser(user);
		this.setPasscode(passcode);
		this.setAlerts(alerts);
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public void setAlerts(ArrayList<Alert> alerts) {
		this.alerts = new ArrayList<Alert>(alerts);
	}

	public String getUser() {
		return this.user;
	}

	public String getPasscode() {
		return this.passcode;
	}
	
	public ArrayList<Alert> getAlerts() {
		return this.alerts;
	}

}
