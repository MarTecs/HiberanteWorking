package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;
import com.pojo.Emp;

public class Test5 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
	
		Transaction transaction = session.beginTransaction();
		
		Dep dep = new Dep();
		dep.setDepid(5);
		dep.setDepname("小卖部");
		
		
		Emp emp = new Emp();
		emp.setEmpid(5);
		emp.setEmpname("秦寿");
		
		//dep.getEmps().add(emp);// 一的一方处理
		emp.setDep(dep);// 多的一方
		
		
		session.save(dep);
		session.save(emp);
		
		transaction.commit();
		
		session.close();
	}
}
