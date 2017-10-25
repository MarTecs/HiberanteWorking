package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.pojo.Emp;
import com.util.HibernateSessionFactory;

public class Test4 {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		String hql = "select e.empid , e.empname , d.depid , d.depname from Emp e join  e.dep d ";
		Query query = session.createQuery(hql);
		List<Object[]> emps = query.list();

		session.close();

		for (Object[] objects : emps) {
			System.out.println(objects[0] + "\t" + objects[1] + "\t"
					+ objects[2] + "\t" + objects[3]);
		}

	}

}
