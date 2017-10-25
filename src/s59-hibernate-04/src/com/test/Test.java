package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Goods goods = (Goods) session.get(Goods.class, 1);
		session.clear();//清空session  清空一级缓存
		Session session2 = HibernateSessionFactory.getSession();
		Goods goods2 = (Goods) session2.get(Goods.class, 1);
		
		//将会返回一个true 也就是两个Session是一样的
		System.out.println(session == session2);
		
		System.out.println(goods.getGoodsid()+"\t" + goods.getGoodsname());
		System.out.println(goods2.getGoodsid()+"\t" + goods2.getGoodsname());

	}

}
