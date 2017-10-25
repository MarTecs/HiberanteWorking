package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test4 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Goods";
		Query query = session.createQuery(hql);
		query.setCacheable(true);
		List<Goods> list = query.list();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsid()+"\t" +goods.getGoodsname());
		}
		
		Goods goods2 = (Goods) session.get(Goods.class,1);
		
		String hql2 = "from Goods";
		Query query2 = session.createQuery(hql2);
		query2.setCacheable(true);
		List<Goods> list2 = query2.list();
		for (Goods goods : list2) {
			System.out.println(goods.getGoodsid()+"\t" +goods.getGoodsname());
		}	
	}
}
