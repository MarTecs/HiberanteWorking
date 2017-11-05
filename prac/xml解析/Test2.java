package com.prac;

import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 读取Document文档，并且获取单个节点的值
 * @author SiVan
 *
 */
public class Test2 {
	
	public static void main(String[] args) throws MalformedURLException, DocumentException {
		
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("d:/books.xml"));
		Element element = (Element) document.selectSingleNode("books/book[@id=1]");
		
		System.out.println(element.getName() + "\t" + element.getText() + "\t" + element.attributeValue("id") + "\t" + element.attributeValue("price"));
		
		
		
		
	}

}
