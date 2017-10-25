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
		goods.setGoodsname("Æ»¹û9");
		
		session.clear();
		//session.flush();//Ë¢ÐÂ»º´æ  
		session.lock(goods, LockMode.NONE);//Ëø
		Goods goods2 = (Goods) session.get(Goods.class, 1);
		
		transaction.commit();
		
		
	}
}
