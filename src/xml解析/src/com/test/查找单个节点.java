package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class 查找单个节点 {

	public static void main(String[] args) throws DocumentException,
			IOException {

		SAXReader reader = new SAXReader();
		// 以输入流作为参数
		Document document = reader.read(new FileInputStream(new File(
				"d:/book.xml")));

		Element element = (Element) document
				.selectSingleNode("books/book[@id='1']");

		if (element != null) {
			System.out.println(element.attributeValue("id") + "\t"
					+ element.attributeValue("price") + "\t"
					+ element.getText());
		}

		element.getParent().remove(element);

		XMLWriter writer = new XMLWriter(new FileOutputStream(new File(
				"d:/book.xml")), OutputFormat.createPrettyPrint());
		writer.write(document);
		writer.close();

	}

}
