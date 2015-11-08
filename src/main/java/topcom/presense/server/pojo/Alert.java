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

	private void setDistance(Double distance) {
		this.distance = distance;
	}

	private void setKind(String kind) {
		this.kind = kind;
	}

	private void setTime(String time) {
		this.time = time;
	}

	private void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private void setMajor(String major) {
		this.major = major;
	}

	private void setMinor(String minor) {
		this.minor = minor;
	}

	private Double getDistance() {
		return this.distance;
	}

	private String getKind() {
		return this.kind;
	}

	private String getTime() {
		return this.time;
	}

	private String getUuid() {
		return this.uuid;
	}

	private String getMajor() {
		return this.major;
	}

	private String getMinor() {
		return this.minor;
	}

}
