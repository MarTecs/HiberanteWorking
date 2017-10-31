package com.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Dep;
import com.util.HibernateSessionFactory;

public class Test3 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction transaction = session.beginTransaction();
				
		Dep dep = new Dep();
		dep.setDepname("Ðû´«²¿");
		session.save(dep);
		
		transaction.commit();
	}
}
