package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Session;
import org.hibernate.impl.SessionFactoryImpl;

import com.util.HibernateSessionFactory;

public class Test8 {

	public static void main(String[] args) throws SQLException {

		Session session = HibernateSessionFactory.getSession();
		Connection connection = ((SessionFactoryImpl) session
				.getSessionFactory()).getConnectionProvider().getConnection();
		
		CallableStatement cs = connection.prepareCall("call testadd(?,?,?)");
		
		cs.setObject(1, 1);
		cs.setObject(2, 2);
		cs.registerOutParameter(3, Types.INTEGER);
		
		cs.executeUpdate();
		int result = cs.getInt(3);//找到第三个结果
		System.out.println(result);
		
	}
}
