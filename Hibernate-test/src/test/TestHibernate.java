package test;


import java.util.List;
import java.util.Vector;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import model.Film;
import model.Pays;

public class TestHibernate {

	private Session session;
	
	public TestHibernate(){
		Configuration configuration = new Configuration().configure();
		
		 ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		
		session = sessionFactory.openSession();
	}
	
	public void insertPays(Pays pays){
		session.beginTransaction();
		session.save(pays);
		session.getTransaction().commit();
	}
	
	public List getAllPays(){
		Query query = session.createQuery("FROM Pays");
		return query.list();	
	}
	
	public List<Film> getAllFilms(){
		Query query = session.createQuery("FROM Film");
		return (List<Film>)query.list();
	}
}
