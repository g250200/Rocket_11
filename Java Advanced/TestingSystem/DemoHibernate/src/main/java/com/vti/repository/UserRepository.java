package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.User;

public class UserRepository {
private SessionFactory sessionFactory;
	
	
	public UserRepository() {
		sessionFactory = buildSessionFactory();
	}

	private SessionFactory buildSessionFactory() {

		// load configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// add entity
		configuration.addAnnotatedClass(User.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);

	}
	
	public List<User> getAllUser() {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Query<User> query = session.createQuery("FROM User");
			return query.list();
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public User getUserByID(short id) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			User user = session.get(User.class, id);
			return user;
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public User getUserByUserName(String userName) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Query<User> query = session.createQuery("FROM User WHERE userName = :nameParameter");
			query.setParameter("namePapameter", userName);
			User user = query.uniqueResult();
			return user;
			
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void createUser(User user) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			
		}
		
		catch (Exception e) {
			session.getTransaction().rollback();
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void updateUser(User user) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			session.update(user);
			
			session.getTransaction().commit();
			
		}
		
		catch (Exception e) {
			session.getTransaction().rollback();
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void updateUser(short id, String newFirstName, String newLastName) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			User user = session.load(User.class, id);
			user.setFirstName(newFirstName);
			user.setLastName(newLastName);
			
			session.getTransaction().commit();
			
		}
		
		catch (Exception e) {
			session.getTransaction().rollback();
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void deleteUser(short id) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			User user = session.load(User.class, id);
			session.delete(user);
			
			session.getTransaction().commit();
			
		}
		
		catch (Exception e) {
			session.getTransaction().rollback();
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public boolean isUserExistsByID(short id) {

		// get department
		User user = getUserByID(id);

		// return result
		if (user == null) {
			return false;
		}

		return true;
	}

	public boolean isUserExistsByName(String userName) {
		User user = getUserByUserName(userName);

		if (user == null) {
			return false;
		}
		return true;
	}
}
