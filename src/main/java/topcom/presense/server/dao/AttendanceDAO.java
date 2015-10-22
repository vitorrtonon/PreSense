package topcom.presense.server.dao;

import topcom.presense.server.pojo.*;

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
