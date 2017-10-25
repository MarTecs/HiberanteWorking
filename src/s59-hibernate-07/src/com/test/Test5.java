package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Emp;
import com.util.HibernateSessionFactory;

public class Test5 {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		String hql = "from Emp e join fetch e.dep";
		Query query = session.createQuery(hql);
		List<Emp> emps = query.list();

		session.close();
		
		for (Emp emp : emps) {
			System.out.println(emp.getEmpid()+"\t" + emp.getEmpname() + "\t" + emp.getDep().getDepname());
		}
		
	}
}
