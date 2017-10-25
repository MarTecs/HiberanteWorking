package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;

public class Test2 {
	
	public static void main(String[] args) {
		//�߸���������
		//1.��ȡ�ܵ������ļ�
		Configuration configuration = new Configuration().configure();
		//2.����session����
		SessionFactory factory = configuration.buildSessionFactory();
		//3.�õ�session
		Session session = factory.openSession();
		//4.��������  
		Transaction transaction = session.beginTransaction();
		
		Dep dep = new Dep();
		dep.setDepid(1);
		dep.setDepname("С����");
		//5.�־û�
		session.save(dep);//������д�����ݿ�
		// 6.�ύ����
		transaction.commit();//�ύ����
		//7.�ر�session
		session.close();
		
	}

}
