package com.learn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learn.entities.Product;

public class ProductDao {
	private SessionFactory factory;

	public ProductDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	
	public boolean saveProduct(Product product)
	{
		boolean f=false;
		try {
			Session session = this.factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			session.close();
			f=true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			f=false;
		}
		return f;
	}
	
}
