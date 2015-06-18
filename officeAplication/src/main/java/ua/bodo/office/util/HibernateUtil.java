package ua.bodo.office.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static{
		try{
			Configuration configuration = new Configuration().configure();
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration
					.buildSessionFactory(serviceRegistry);
			} catch(Throwable e){
				throw new ExceptionInInitializerError(e);
			}
		}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
		

}
}
