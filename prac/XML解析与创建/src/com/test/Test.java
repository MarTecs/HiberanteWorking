package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

/**
 * 
 * @author SiVan
 * @time 2017��11��3�� ����8:15:54
 * TODO ����һ��XML�ĵ���������
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		Document document = new DocumentFactory().createDocument();
		Element root = document.addElement("books");
		
		Element book1 = root.addElement("book");
		book1.addAttribute("id", "1");
		book1.addAttribute("price", "888");
		book1.setText("�����˲�");
		
		XMLWriter writer = new XMLWriter(new FileOutputStream(new File("F:/book.xml")));
		writer.write(document);
		writer.close();
	}

}
