package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Testa {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		
		Goods goods = (Goods) session.get(Goods.class, 1);
		
		//session.clear();//������л���
		session.evict(goods);//�������
		
		Goods  goods2 = (Goods) session.get(Goods.class, 1);
		
		
	}
}
