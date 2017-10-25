package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test {

	public static void main(String[] args) {

		// hql
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Goods";
		Query query = session.createQuery(hql);
		List<Goods> list = query.list();
		for (Goods goods : list) {
			System.out
					.println(goods.getGoodsid() + "\t" + goods.getGoodsname());
		}

	}

}
