package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.UserInfo;

public class Test3 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		UserInfo info = (UserInfo) session.get(UserInfo.class, "tingting");

		info.getGoods().clear();//Çå¿Õ¼¯ºÏ 

		session.update(info);

		transaction.commit();

		session.close();

	}

}
