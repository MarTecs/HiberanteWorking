package com.prac;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 通过获得Document 文档 然后选取所有节点
 * @author SiVan
 *
 */
public class Test3 {
	
	public static void main(String[] args) throws MalformedURLException, DocumentException {
		
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("d:/books.xml"));
		
		List elements = document.selectNodes("books/book");
		
		for (Object object : elements) {
			
			Element element = (Element) object;
			System.out.println(element.getText() + "\t" + element.attributeValue("id") + "\t" + element.attributeValue("price"));
			
			
		}
		
		
	}

}
