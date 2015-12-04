package topcom.presense.server.util;

import java.util.Calendar;
import java.sql.Timestamp;
import java.util.*;

public class Attendancebackup {

	private static Attendancebackup instance;
	
	/* Define flags para alteração ou não das consultas especiais (envolvem views) */
	private Attendancebackup() {}
	
	public static synchronized Attendancebackup getInstance() {
		if (instance == null) {
			instance = new Attendancebackup();
		}
		return instance;
	}

	private Timestamp total;
	private Timestamp last;

	public Timestamp getTotal() {
		return total;
	}
	
	public Timestamp getLast() {
		return last;
	}

	public synchronized void setTotal(Timestamp t) {
		this.total = t;
	}
	
	public synchronized void setLast(Timestamp t) {
		this.last = t;
	}
}