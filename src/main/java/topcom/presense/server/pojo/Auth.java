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
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public String getUser() {
		return this.user;
	}

	public String getPasscode() {
		return this.passcode;
	}

}
