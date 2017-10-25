package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test3 {

	public static void main(String[] args) {

		// hql
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Goods where goodsid >= ? and goodsid <= ? ";
		Query query = session.createQuery(hql);
		
		query.setParameter(0, 3);// ? ´Ó0¿ªÊ¼
		query.setParameter(1, 5);
		
		List<Goods> list = query.list();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsid()+"\t" + goods.getGoodsname());
		}
		
		
	}
}
