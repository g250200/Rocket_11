package com.vti.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import com.vti.entity.TestingCategory;

/**
 * This class is .
 * 
 * @Description: .
 * @author: TĐGiang
 * @create_date: May 11, 2021
 * @version: 1.0
 * @modifer: TĐGiang
 * @modifer_date: May 11, 2021
 */
public class TestingCategoryRepository {
	
	private SessionFactory sessionFactory;
	
	public TestingCategoryRepository() {
		sessionFactory = buildSessionFactory();
	}

	private SessionFactory buildSessionFactory() {

		// load configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		// add entity
		configuration.addAnnotatedClass(TestingCategory.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		return configuration.buildSessionFactory(serviceRegistry);

	}
	
	public List<TestingCategory> getAllTestingcategory() {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Query<TestingCategory> query = session.createQuery("FROM TestingCategory");
			return query.list();
			
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public TestingCategory getTestingCategoryByID(short id) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			TestingCategory testingCategory = session.get(TestingCategory.class, id);
			
			return testingCategory;
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public TestingCategory getTestingCategoryByName(String name) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			Query<TestingCategory> query = session.createQuery("FROM TestingCategory WHERE name = :nameParameter");
			query.setParameter("nameParameter", name);
			TestingCategory testingCategory = query.uniqueResult();
			return testingCategory;
		}
		finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	
	public void createTestingCategory(TestingCategory testingCategory) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			session.save(testingCategory);
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
	
	public void updateTestingCategory(short id, String newName) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			TestingCategory testingCategory = session.load(TestingCategory.class, id);
			testingCategory.setName(newName);
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
	
	public void updateTestingCategory(TestingCategory testingCategory) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			session.update(testingCategory);
			
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
	
	public void deleteTestingCategory(short id) {
		Session session = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			TestingCategory testingCategory = session.load(TestingCategory.class, id);
			session.delete(testingCategory);
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
	public boolean isTestingCategoryExistsByID(short id) {

		// get department
		TestingCategory testingCategory = getTestingCategoryByID(id);

		// return result
		if (testingCategory == null) {
			return false;
		}

		return true;
	}

	public boolean isTestingCategoryExistsByName(String name) {
		TestingCategory testingCategory = getTestingCategoryByName(name);

		if (testingCategory == null) {
			return false;
		}
		return true;
	}
}
