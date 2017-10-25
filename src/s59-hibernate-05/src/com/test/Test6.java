package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test6 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		Goods goods = (Goods) session.get(Goods.class, 3);
		goods.setGoodsname("HTC");
		
		session.update(goods);
		transaction.commit();
		
	}
}
