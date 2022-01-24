package com.learn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.learn.entities.User;

public class UserDao {
	private SessionFactory factory;

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	//get user by email and password
	public User getUserByEmailAndPassword(String userEmail,String userPassword)
	{
		User user=null;
		
		try {
			String query="from User where userEmail =: e and userPassword =:p";
			Session session = this.factory.openSession();
			Query q = session.createQuery(query);
			q.setParameter("e", userEmail);
			q.setParameter("p", userPassword);
			user =(User)q.uniqueResult();
			
			
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return user;
	}
}
