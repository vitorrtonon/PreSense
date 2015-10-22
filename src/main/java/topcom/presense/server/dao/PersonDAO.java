package topcom.presense.server.dao;

import topcom.presense.server.pojo.*;

public class PersonDAO extends HibernateDAO {

	public boolean insert(Person obj) {

		return(super.insert(obj));
	}

	public boolean update(Person obj) {

		return(super.update(obj));
	}

	public boolean delete(Person obj) {

		return(super.delete(obj));
	}
}
