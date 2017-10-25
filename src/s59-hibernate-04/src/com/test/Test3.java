package com.test;

import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;


public class Test3 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Goods goods = (Goods) session.get(Goods.class, 1);
		Goods goods2 = (Goods) session.get(Goods.class, 1);

		System.out.println(goods.getGoodsid() + "\t" + goods.getGoodsname());
		System.out.println(goods2.getGoodsid() + "\t" + goods2.getGoodsname());

	}

}
