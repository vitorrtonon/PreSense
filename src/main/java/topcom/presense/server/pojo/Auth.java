package topcom.presense.server.pojo;

import java.util.*;

public class Auth {

	private String user;
	private String passcode;
	private String message;

	public Auth() {}

	public Auth(String user, String passcode, String message) {
		this.setUser(user);
		this.setPasscode(passcode);
		this.setMessage(message);
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUser() {
		return this.user;
	}

	public String getPasscode() {
		return this.passcode;
	}

	public String getMessage() {
		return this.message;
	}

}
