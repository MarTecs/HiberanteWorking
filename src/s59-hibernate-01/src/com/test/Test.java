package com.test;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Test {
	
	public static void main(String[] args) {
		//读取总的配置文件
		Configuration configuration = new Configuration().configure();
		//根据pojo类生成表格
		SchemaExport export = new SchemaExport(configuration);
		export.create(true, true);//生成表格
		
		
		
	}

}
