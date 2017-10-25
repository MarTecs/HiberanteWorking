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
		dep.setDepname("С����");
		
		
		Emp emp = new Emp();
		emp.setEmpid(5);
		emp.setEmpname("����");
		
		//dep.getEmps().add(emp);// һ��һ������
		emp.setDep(dep);// ���һ��
		
		
		session.save(dep);
		session.save(emp);
		
		transaction.commit();
		
		session.close();
	}
}
