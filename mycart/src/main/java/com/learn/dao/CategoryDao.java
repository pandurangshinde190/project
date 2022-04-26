package com.learn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.entities.Category;

public class CategoryDao {
	private SessionFactory factory;
	
	public CategoryDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public int saveCategory(Category category)
	{
		Session session = this.factory.openSession();
		Transaction tx = session.beginTransaction();
		Integer catId=(Integer)session.save(category);
		
		tx.commit();
		session.close();
		return catId;
	}
	
}
