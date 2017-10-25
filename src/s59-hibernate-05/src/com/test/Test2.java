package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test2 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Goods goods = (Goods) session.get("com.pojo.Goods", 8);
		System.out.println(goods);
		Goods goods2 = (Goods) session.load(Goods.class, 8);
		System.out.println(goods2);
	}
	
}
