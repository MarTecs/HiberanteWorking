package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;

public class Test2 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Dep dep = (Dep) session.get(Dep.class, 1);

		if (dep != null) {
			dep.setDepname("Ðû´«²¿");
			session.update(dep);//ÐÞ¸Ä
		}

		transaction.commit();

		session.close();

	}

}
