package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test9 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		
		Goods goods2 = new Goods();
		goods2.setGoodsname("Nokia");
		session.persist(goods2);
		
	}
}
