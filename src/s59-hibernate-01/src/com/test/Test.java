package com.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test {
	
	public static void main(String[] args) {
		//��ȡ�ܵ������ļ�
		Configuration configuration = new Configuration().configure();
		//����pojo�����ɱ��
		SchemaExport export = new SchemaExport(configuration);
		export.create(true, true);//���ɱ��
		
		
		
	}

}
