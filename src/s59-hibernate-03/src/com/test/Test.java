package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Goods;
import com.pojo.UserInfo;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		// 新增一个用户
		Transaction transaction = session.beginTransaction();

		UserInfo info = new UserInfo();
		info.setUsername("tingting");
		info.setPassword("tingting");

		Goods goods = new Goods();
		goods.setGoodsid(2);
		goods.setGoodsname("note8");

		//info.getGoods().add(goods);//操作中间表
		
		goods.getInfos().add(info);
		
		session.save(goods);
		session.save(info);
		
		
		transaction.commit();
		session.close();

	}

}
