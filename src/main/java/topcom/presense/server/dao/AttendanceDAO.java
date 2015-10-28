package topcom.presense.server.dao;

import java.util.*; 
import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class AttendanceDAO extends HibernateDAO {

	private static final String SELECT_ATTENDANCE_BY_EVENT_AND_PERSON = "from Attendance A where A.event = :event and A.person = :person";

	public boolean insert(Attendance obj) {

		return(super.insert(obj));
	}

	public boolean update(Attendance obj) {

		return(super.update(obj));
	}

	public boolean delete(Attendance obj) {

		return(super.delete(obj));
	}

	public Attendance findAttendanceByEventAndPerson(long event, long person) {

		Session session = null;
		Transaction transaction = null;
		Attendance attendance = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_ATTENDANCE_BY_EVENT_AND_PERSON);
			query.setLong("event", event);
			query.setLong("person", person);

			attendance = (Attendance) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return attendance;
	}
}
