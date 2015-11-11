package topcom.presense.server.pojo;

import java.util.*;

public class Auth {

	private String user;
	private String pass;

	public Auth() {}

	public Auth(String user, String pass) {
		this.setUser(user);
		this.setPass(pass);
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUser() {
		return this.user;
	}

	public String getPass() {
		return this.pass;
	}
}
