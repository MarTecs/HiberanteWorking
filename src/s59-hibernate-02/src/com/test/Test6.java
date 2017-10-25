package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;
import com.pojo.Emp;

public class Test6 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Dep dep = new Dep();
		dep.setDepid(6);
		dep.setDepname("С����");

		Emp emp = new Emp();
		emp.setEmpid(6);
		emp.setEmpname("����");

		emp.setDep(dep);

		//dep.getEmps().add(emp);
		
		session.save(emp);

		transaction.commit();

		session.close();
	}
}
