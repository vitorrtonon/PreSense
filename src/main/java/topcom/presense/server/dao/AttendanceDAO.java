package topcom.presense.server.dao;

import java.util.*; 
import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class AttendanceDAO extends HibernateDAO {

	public boolean insert(Attendance obj) {

		return(super.insert(obj));
	}

	public boolean update(Attendance obj) {

		return(super.update(obj));
	}

	public boolean delete(Attendance obj) {

		return(super.delete(obj));
	}
}
