package topcom.presense.server.dao;

import topcom.presense.server.pojo.*;

public class EventDAO extends HibernateDAO {

	public boolean insert(Event obj) {

		return(super.insert(obj));
	}

	public boolean update(Event obj) {

		return(super.update(obj));
	}

	public boolean delete(Event obj) {

		return(super.delete(obj));
	}
}
