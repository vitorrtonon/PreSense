package topcom.presense.server.dao;

import java.util.*;
import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class EventDAO extends HibernateDAO {

	private static final String SELECT_ALL_EVENTS = "from Event";
	private static final String SELECT_EVENT_BY_ID = "from Event E where E.id = :id";
	private static final String SELECT_EVENTS_BY_NAME = "from Event E where E.name = :name";

	public boolean insert(Event obj) {

		return(super.insert(obj));
	}

	public boolean update(Event obj) {

		return(super.update(obj));
	}

	public boolean delete(Event obj) {

		return(super.delete(obj));
	}

	public static List<Event> findAllEvents() {

		Session session = null;
		Transaction transaction = null;
		List<Event> events = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_ALL_EVENTS);
			events = (List<Event>) query.list();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return events;
	}

	public static Event findEventById(long id) {

		Session session = null;
		Transaction transaction = null;
		Event event = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_EVENT_BY_ID);
			query.setLong("id", id);

			event = (Event) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return event;
	}

	public static List<Event> findEventsByName(String name) {

		Session session = null;
		Transaction transaction = null;
		List<Event> events = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_EVENTS_BY_NAME);
			query.setString("name", name);

			events = (List<Event>) query.list();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return events;
	}
}
