package com.test;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.HibernateSessionFactory;

public class Test2 {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
		String hql = "select u.username , g.goodsname from Userinfo u , Goods g ";
		
		Query query = session.createQuery(hql);
		
		List<Object[]> list = query.list();
		
		for (Object[] objects : list) {
			System.out.println(objects[0] + "\t" + objects[1]);
		}
		


	}

}
