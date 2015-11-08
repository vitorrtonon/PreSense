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

	private void setUser(String user) {
		this.user = user;
	}

	private void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	private void setAlerts(ArrayList<Alert> alerts) {
		this.alerts = new ArrayList<Alert>(alerts);
	}

	private String getUser() {
		return this.user;
	}

	private String getPasscode() {
		return this.passcode;
	}
	
	private ArrayList<Alert> getAlerts() {
		return this.alerts;
	}

}
