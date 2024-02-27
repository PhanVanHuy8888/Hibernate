package phanvanhuy.edu.vn.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.*;
import org.hibernate.service.*;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	static {
		try {
			Configuration config = new Configuration().configure();
			ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			sessionFactory = config.buildSessionFactory(reg);
		}catch(Throwable ex) {
			ex.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
			return sessionFactory;
	}
}
