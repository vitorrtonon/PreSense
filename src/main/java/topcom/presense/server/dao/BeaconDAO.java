package topcom.presense.server.dao;

import org.hibernate.*;

import topcom.presense.server.util.*;
import topcom.presense.server.pojo.*;

public class BeaconDAO extends HibernateDAO {

	public static final String SELECT_BEACON_BY_ID = "from Beacon B where B.id = :id";

	public boolean insert(Beacon obj) {

		return(super.insert(obj));
	}

	public boolean update(Beacon obj) {

		return(super.update(obj));
	}

	public boolean delete(Beacon obj) {

		return(super.delete(obj));
	}

	public Beacon findBeaconById(String id) {

		Session session = null;
		Transaction transaction = null;
		Beacon beacon = null;

		try {

			session = HibernateUtil.getSessionFactory().openSession();

			transaction = session.beginTransaction();

			Query query = session.createQuery(SELECT_BEACON_BY_ID);
			query.setString("id", id);

			beacon = (Beacon) query.uniqueResult();

			transaction.commit();
		}
		catch(Exception e) {

			if(transaction != null) transaction.rollback();

			e.printStackTrace();
		}
		finally {

			if(session != null) session.close();
		}
	
		return beacon;
	}
}
