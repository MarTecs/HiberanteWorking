package com.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class ����XML {

	public static void main(String[] args) throws IOException {

		// ����һ���հ��ĵ�
		Document document = DocumentHelper.createDocument();

		Element root = document.addElement("books");

		Element book1 = root.addElement("book");
		book1.addAttribute("id", "1");
		book1.addAttribute("price", "100");
		book1.setText("�����˲�");

		Element book2 = root.addElement("book");
		book2.addAttribute("id", "2");
		book2.addAttribute("price", "200");
		book2.setText("���Ǿ�");

		Element book3 = root.addElement("book");
		book3.addAttribute("id", "3");
		book3.addAttribute("price", "300");
		book3.setText("����������");

		XMLWriter writer = new XMLWriter(new FileOutputStream(new File(
				"d:/book.xml")), OutputFormat.createPrettyPrint());
		writer.write(document);
		writer.close();

	}

}
