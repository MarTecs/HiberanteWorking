package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test6 {

	public static void main(String[] args) {

		// ͶӰ
		Session session = HibernateSessionFactory.getSession();

		String hql = "select new Goods(goodsid , goodsname) from Goods";
		Query query = session.createQuery(hql);

		List<Goods> list = query.list();

		for (Goods goods : list) {
			System.out.println(goods.getGoodsid() + "\t" + goods.getGoodsname());
		}

	}
}
