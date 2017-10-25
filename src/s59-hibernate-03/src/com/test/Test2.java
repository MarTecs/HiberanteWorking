package com.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Goods;
import com.pojo.UserInfo;

public class Test2 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		
		
		UserInfo info = (UserInfo) session.get(UserInfo.class, "tingting");
		
		Set<Goods> set = info.getGoods();
		
		for (Goods goods : set) {
			System.out.println(goods.getGoodsid()+"\t"+goods.getGoodsname());
		}
	
		session.close();

	}

}
