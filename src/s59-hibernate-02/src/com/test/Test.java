package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Dep dep = (Dep) session.get(Dep.class, 1);

		if (dep != null) {
			session.delete(dep);
		}

		transaction.commit();

		session.close();

	}

}
