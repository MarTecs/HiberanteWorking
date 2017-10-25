package com.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;
import com.pojo.Emp;

public class Test4 {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();

		Session session = factory.openSession();
		
		Dep dep = (Dep) session.get(Dep.class, 1);
		Set<Emp> emps = dep.getEmps();
		
		for (Emp emp : emps) {
			System.out.println(emp.getEmpid()+"\t" + emp.getEmpname());
		}
		
		session.close();
	}
}
