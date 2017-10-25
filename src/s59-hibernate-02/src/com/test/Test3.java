package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Emp;

public class Test3 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Emp emp = (Emp) session.get(Emp.class, 1);
		System.out.println(emp.getEmpid() + "\t" + emp.getEmpname() + "\t"
				+ emp.getDep().getDepname());
		transaction.commit();
		session.close();
	}
}
