package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Dep;

public class Test2 {
	
	public static void main(String[] args) {
		//七个基本步骤
		//1.读取总的配置文件
		Configuration configuration = new Configuration().configure();
		//2.创建session工程
		SessionFactory factory = configuration.buildSessionFactory();
		//3.得到session
		Session session = factory.openSession();
		//4.开启事务  
		Transaction transaction = session.beginTransaction();
		
		Dep dep = new Dep();
		dep.setDepid(1);
		dep.setDepname("小卖部");
		//5.持久化
		session.save(dep);//把数据写进数据库
		// 6.提交事务
		transaction.commit();//提交事务
		//7.关闭session
		session.close();
		
	}

}
