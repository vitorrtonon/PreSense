package topcom.presense.server.dao;

import org.hibernate.*;

import topcom.presense.server.util.*;

public class HibernateDAO {

	public boolean insert(Object obj) {

		Session session = null;
		Transaction transaction = null;

		boolean result = false;

		try {

			/* Abre uma sessao, ou seja, inicia a conexao do codigo
			java com o banco de dados. */
			session = HibernateUtil.getSessionFactory().openSession();

			/* Marca o inicio da transacao. Todos os comandos ate que
			a transacao seja fechada devem ser executados atomicamente. */
			transaction = session.beginTransaction();

			/* Salva o objeto no banco de dados. Operacao de insert. */
			session.save(obj);

			/* Marca o fim da transacao, salvando as alteracoes. */
			transaction.commit();

			result = true;
		}
		catch(Exception e) {

			/* Desfaz as alteracoes de forma a manter a consistencia
			do banco de dados. */
			if(transaction != null) transaction.rollback();

			e.printStackTrace();

			result = false;
		}
		finally {

			if(session != null) session.close();
		}

		return result;
	}

	public boolean update(Object obj) {

		Session session = null;
		Transaction transaction = null;

		boolean result = false;

		try {

			/* Abre uma sessao, ou seja, inicia a conexao do codigo
			java com o banco de dados. */
			session = HibernateUtil.getSessionFactory().openSession();

			/* Marca o inicio da transacao. Todos os comandos ate que
			a transacao seja fechada devem ser executados atomicamente. */
			transaction = session.beginTransaction();

			/* Salva o objeto no banco de dados. Operacao de insert. */
			session.saveOrUpdate(obj);

			/* Marca o fim da transacao, salvando as alteracoes. */
			transaction.commit();

			result = true;
		}
		catch(Exception e) {

			/* Desfaz as alteracoes de forma a manter a consistencia
			do banco de dados. */
			if(transaction != null) transaction.rollback();

			e.printStackTrace();

			result = false;
		}
		finally {

			if(session != null) session.close();
		}

		return result;
	}

	public boolean delete(Object obj) {

		Session session = null;
		Transaction transaction = null;

		boolean result = false;

		try {

			/* Abre uma sessao, ou seja, inicia a conexao do codigo
			java com o banco de dados. */
			session = HibernateUtil.getSessionFactory().openSession();

			/* Marca o inicio da transacao. Todos os comandos ate que
			a transacao seja fechada devem ser executados atomicamente. */
			transaction = session.beginTransaction();

			/* Remove o objeto no banco de dados. Operacao de insert. */
			session.delete(obj);

			/* Marca o fim da transacao, salvando as alteracoes. */
			transaction.commit();

			result = true;
		}
		catch(Exception e) {

			/* Desfaz as alteracoes de forma a manter a consistencia
			do banco de dados. */
			if(transaction != null) transaction.rollback();

			e.printStackTrace();

			result = false;
		}
		finally {

			if(session != null) session.close();
		}

		return result;
	}	
}
