package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		Goods goods = (Goods) session.get("com.pojo.Goods", 1);
		session.clear();
		Goods goods2 = (Goods) session.load(Goods.class,1);
		System.out.println(goods2.getGoodsid() +"\t"+ goods2.getGoodsname());
		
		
		

	}

}
