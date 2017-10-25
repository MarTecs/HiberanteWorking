package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Goods;

public class Test2 {

	public static void main(String[] args) {
		
		
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Goods goods = (Goods) session.get(Goods.class, 1);
		Session session2 = factory.openSession();
		Goods goods2 = (Goods) session2.get(Goods.class, 1);
		
		System.out.println(session==session2);
		
		System.out.println(goods.getGoodsid()+"\t" + goods.getGoodsname());
		System.out.println(goods2.getGoodsid()+"\t" + goods2.getGoodsname());

	}

}
