package topcom.presense.server.dao;

import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class SensorDAO extends HibernateDAO {

	private static final String SELECT_SENSOR_BY_ID = "from Sensor S where S.id = :id";
	private static final String SELECT_SENSOR_BY_PIN = "from Sensor S where S.pin = :pin";

	public boolean insert(Sensor obj) {

		return(super.insert(obj));
	}

	public boolean update(Sensor obj) {

		return(super.update(obj));
	}

	public boolean delete(Sensor obj) {

		return(super.delete(obj));
	}

	public Sensor findSensorById(long id) {

		Session session = null;
		Transaction transaction = null;
		Sensor sensor = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_SENSOR_BY_ID);
			query.setLong("id", id);

			sensor = (Sensor) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return sensor;
	}

	public Sensor findSensorByPin(int pin) {

		Session session = null;
		Transaction transaction = null;
		Sensor sensor = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_SENSOR_BY_PIN);
			query.setInteger("pin", pin);

			sensor = (Sensor) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return sensor;
	}
}
