package topcom.presense.server.pojo;

import java.util.*;

public class Alert {

	private Double distance;
	private String kind;
	private String time;
	private String uuid;
	private String major;
	private String minor;

	public Alert() {}

	public Alert(Double distance, String kind, String time,
				String uuid, String major, String minor) {

		this.setDistance(distance);
		this.setKind(kind);
		this.setTime(time);
		this.setUuid(uuid);
		this.setMajor(major);
		this.setMinor(minor);
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public Double getDistance() {
		return this.distance;
	}

	public String getKind() {
		return this.kind;
	}

	public String getTime() {
		return this.time;
	}

	public String getUuid() {
		return this.uuid;
	}

	public String getMajor() {
		return this.major;
	}

	public String getMinor() {
		return this.minor;
	}

}
