package com.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Test2 {

	public static void main(String[] args) {

		// hql
		Session session = HibernateSessionFactory.getSession();
		String hql = "from Goods";
		Query query = session.createQuery(hql);
		Iterator<Goods> iterator = query.iterate();

		//�Ȳ��ҳ����е�����  ��Ҫ�õ�ʱ���ٸ�����������
		
		while (iterator.hasNext()) {
			Goods goods = iterator.next();
			System.out.println(goods.getGoodsid() + "\t" + goods.getGoodsname());
		}
		
		
	}
}
