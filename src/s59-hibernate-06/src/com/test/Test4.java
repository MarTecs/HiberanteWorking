package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test4 {

	public static void main(String[] args) {

		// hql
		Session session = HibernateSessionFactory.getSession();
		Query query = session.getNamedQuery("com.pojo.Goods.findbyid");
		//Query query = session.getNamedQuery("findall");
		
		query.setParameter(0, 5);
		
		
		List<Goods> list = query.list();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsid()+"\t" + goods.getGoodsname());
		}
		
	}
}
