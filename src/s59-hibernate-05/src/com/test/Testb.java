package com.test;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Goods;
import com.util.HibernateSessionFactory;

public class Testb {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
		Goods goods = (Goods) session.get(Goods.class, 1);
		goods.setGoodsname("ƻ��9");
		
		session.clear();
		//session.flush();//ˢ�»���  
		session.lock(goods, LockMode.NONE);//��
		Goods goods2 = (Goods) session.get(Goods.class, 1);
		
		transaction.commit();
		
		
	}
}
