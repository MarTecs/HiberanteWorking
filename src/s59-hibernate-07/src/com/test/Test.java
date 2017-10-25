package com.test;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
		String hql = "select count(*) from Goods";
		Query query = session.createQuery(hql);
		
		
		
		/*
		//æ€∫œ≤È—Ø
		Object object = query.uniqueResult();
		System.out.println(object.getClass()+"\t" +object);
		*/
		
		List<Object> list = query.list();
		Object object = list.get(0);
		System.out.println(object.getClass()+"\t" +object);
		
		
		
		
		
		

	}

}
