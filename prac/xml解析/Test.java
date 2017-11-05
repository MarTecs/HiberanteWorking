package com.prac;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;

/**
 * 创建XML文档并且保存到d:/books.xml
 * @author SiVan
 *
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		
		//首先创建Document对象
		Document document = DocumentHelper.createDocument();
		
		//创建根节点
		Element root = document.addElement("books");
		
		//创建根节点下的两个子节点
		Element element1 = root.addElement("book");
		element1.addAttribute("id", "1");
		element1.addAttribute("price", "888");
		element1.setText("天龙八部");
		
		
		Element element2 = root.addElement("book");
		element2.addAttribute("id", "2");
		element2.addAttribute("price", "666");
		element2.setText("武林秘籍");
		
		//将写完的文档写到d:/books.xml
		XMLWriter writer = new XMLWriter(new FileOutputStream(new File("d:/books.xml")));
		writer.write(document);
		writer.close();
		
		
		
	}

}
