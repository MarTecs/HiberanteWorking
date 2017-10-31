package com.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyIdGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor session, Object object)
			throws HibernateException {

		Connection connection = session.connection();// 得到连接对象

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		String dateString = sdf.format(date);

		String sql = "select max(depid) from dep where depid like ? ";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setObject(1, "%"+dateString+"%");

			ResultSet rs = ps.executeQuery();

			rs.next();
			System.out.println(rs.getString(1) != null);
			if (rs.getString(1) != null) {
				String tempid = rs.getString(1).substring(2);
				String id = "sj" + (Long.parseLong(tempid) + 1);
				System.out.println(id);
				return id;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "sj" + dateString + "000001";

	}

}
