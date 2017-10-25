package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test5 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		
		Goods goods = new Goods();
		goods.setGoodsid(10);
		goods.setGoodsname("ะกรื");
		
		session.update(goods);
		
		transaction.commit();
		
	}
	
	
}
