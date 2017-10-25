package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Testc {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		Goods goods = new Goods();
		goods.setGoodsid(4);
		
		session.delete(goods);
		
		transaction.commit();
		
		
	}
}
