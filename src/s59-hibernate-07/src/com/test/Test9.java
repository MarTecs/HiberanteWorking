package com.test;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Bank;

public class Test9 {

	public static void main(String[] args) throws SQLException {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Bank bank = (Bank) session.get(Bank.class,1);
		
		Configuration configuration2 = new Configuration().configure();
		SessionFactory factory2 = configuration2.buildSessionFactory();
		Session session2 = factory2.openSession();
		Bank bank2 = (Bank) session2.get(Bank.class, 1);
		
		System.out.println(bank.getMoney());
		System.out.println(bank2.getMoney());
		
		System.out.println(bank.getMoney()>=5000);
		
		Transaction transaction = session.beginTransaction();
		
		if(bank.getMoney()>=5000){
			bank.setMoney(bank.getMoney()-500);
			System.out.println("取走了5000");
		}
		session.update(bank);

		transaction.commit();
		
		Transaction transaction2 = session2.beginTransaction();
		
		if(bank2.getMoney()>=2000){
			bank2.setMoney(bank2.getMoney()-2000);
			System.out.println("又取走了5000");
		}
		
		session2.update(bank2);
		transaction2.commit();
		
	}
}
