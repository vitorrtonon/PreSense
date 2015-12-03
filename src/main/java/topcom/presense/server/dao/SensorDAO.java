package topcom.presense.server.dao;

import java.util.*;
import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class SensorDAO extends HibernateDAO {

	private static final String SELECT_SENSOR_BY_ID = "from Sensor S where S.id = :id";
	private static final String SELECT_SENSOR_BY_PIN = "from Sensor S where S.pin = :pin";
	private static final String SELECT_SENSOR_BY_NAME_AND_PASS = "from Sensor S where S.name = :name and S.pass = :pass";
	private static final String SELECT_ALL_SENSORS = "from Sensor S";

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

	public Sensor findSensorByNameAndPass(String name, String pass) {

		Session session = null;
		Transaction transaction = null;
		Sensor sensor = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_SENSOR_BY_NAME_AND_PASS);
			query.setString("name", name);
			query.setString("pass", pass);

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

	public static List<Sensor> findAllSensors() {

		Session session = null;
		Transaction transaction = null;
		List<Sensor> sensors = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_ALL_SENSORS);
			sensors = (List<Sensor>) query.list();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return sensors;
	}

}
