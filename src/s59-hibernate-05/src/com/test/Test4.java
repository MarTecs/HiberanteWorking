package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test4 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		Goods goods = (Goods) session.get(Goods.class, 3);
		goods.setGoodsname("÷È×å");
		
		session.save(goods);
		
		transaction.commit();
		
	}
	
	
}
