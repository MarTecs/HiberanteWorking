package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test8 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		Goods goods = (Goods) session.get(Goods.class, 1);
		
		Goods goods2 = new Goods();
		goods2.setGoodsid(1);
		//session.saveOrUpdate(goods2);
		session.merge(goods2);
		transaction.commit();
		
	}
}
