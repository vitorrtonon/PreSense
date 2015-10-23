package topcom.presense.server.dao;

import org.hibernate.*;

import topcom.presense.server.pojo.*;
import topcom.presense.server.util.*;

public class ManagerDAO extends HibernateDAO {

	public static final String SELECT_MANAGER_BY_USERNAME = "from Manager M where M.username = :username";
	public static final String SELECT_MANAGER_BY_USERNAME_AND_PASSWORD = "from Manager M where M.username = :username and M.password = :password";

	public boolean insert(Manager obj) {

		return(super.insert(obj));
	}

	public boolean update(Manager obj) {

		return(super.update(obj));
	}

	public boolean delete(Manager obj) {

		return(super.delete(obj));
	}

	public Manager findManagerByUsername(String username) {

		Session session = null;
		Transaction transaction = null;
		Manager manager = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_MANAGER_BY_USERNAME);
			query.setString("username", username);

			manager = (Manager) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return manager;
	}

	public Manager findManagerByUsernameAndPassword(String username, String password) {

		Session session = null;
		Transaction transaction = null;
		Manager manager = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_MANAGER_BY_USERNAME_AND_PASSWORD);
			query.setString("username", username);
			query.setString("password", password);

			manager = (Manager) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return manager;
	}
}
