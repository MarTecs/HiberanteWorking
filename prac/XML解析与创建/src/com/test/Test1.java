package com.test;

import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 
 * @author SiVan
 * @time 2017年11月3日 上午8:27:09
 * TODO	查找单个节点
 */
public class Test1 {
	
	public static void main(String[] args) throws MalformedURLException, DocumentException {
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("F:/book.xml"));
		
		Element element = (Element) document.selectSingleNode("books/book[@id='1']");	
		if(element != null) {
			System.out.println(element.attributeValue("id") + "\t" + element.attributeValue("price") + "\t" +  element.getText());
		}
		
		
	}

}
