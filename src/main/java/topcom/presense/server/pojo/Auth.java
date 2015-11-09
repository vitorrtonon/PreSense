package topcom.presense.server.pojo;

import java.util.*;

public class Auth {

	private Double distance;
	private String event;
	private String time;
	private String uuid;
	private String major;
	private String minor;
	private String user;
	private String passcode;


	public Auth() {}

	public Auth(String user, String passcode) {
		this.setUser(user);
		this.setPasscode(passcode);
	}
	
	private void setUser(String user) {
		this.user = user;
	}

	private void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	private String getUser() {
		return this.user;
	}

	private String getPasscode() {
		return this.passcode;
	}

}
