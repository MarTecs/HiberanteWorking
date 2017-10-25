package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;

public class Test3 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Dep dep = (Dep) session.get(Dep.class, 1);//根据主键查找
		System.out.println(dep.getDepid() + "\t" + dep.getDepname());
		session.close();

	}

}
