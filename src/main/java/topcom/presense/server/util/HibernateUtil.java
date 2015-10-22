package topcom.presense.server.util;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateUtil {

	/* Responsavel pela criacao de sessoes. */
	private static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		SessionFactory sessionFactory = null;

		try {

			Configuration cfg = new Configuration();

			/* Aplicar as configuracoes de hibernate.cfg.xml ao session factory. */
			cfg.configure();

			/* Cria uma Session Factory de acordo com as configuracoes 
			especificacoes. */
			sessionFactory = cfg.buildSessionFactory();			
		}
		catch(Exception e) {

			e.printStackTrace();
		}

		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}
}
