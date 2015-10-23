package topcom.presense.server.dao;

import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class PersonDAO extends HibernateDAO {

	public static final String SELECT_PERSON_BY_ID = "from Person P where P.id = :id";

	public boolean insert(Person obj) {

		return(super.insert(obj));
	}

	public boolean update(Person obj) {

		return(super.update(obj));
	}

	public boolean delete(Person obj) {

		return(super.delete(obj));
	}

	public Person findPersonById(long id) {

		Session session = null;
		Transaction transaction = null;
		Person person = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_PERSON_BY_ID);
			query.setLong("id", id);

			person = (Person) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return person;
	}
}
