package com.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.impl.SessionFactoryImpl;

import com.util.HibernateSessionFactory;

public class Test7 {

	public static void main(String[] args) throws SQLException {

		Session session = HibernateSessionFactory.getSession();
		Connection connection = ((SessionFactoryImpl) session
				.getSessionFactory()).getConnectionProvider().getConnection();
		
		CallableStatement cs = connection.prepareCall("call finduserbyusername(?)");
		
		cs.setObject(1, "caizong");
		
		ResultSet rs = cs.executeQuery();
		
		while(rs.next()){
			System.out.println(rs.getString(1) + "\t" + rs.getString(2) );
		}
	}
}
