package com.prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 首先读取Document内容，然后修改Document内容中的某一处值
 * @author SiVan
 *
 */
public class Test4 {
	
	
	public static void main(String[] args) throws DocumentException, IOException {
		
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("d:/books.xml"));
		Element element = (Element) document.selectSingleNode("books/book[@id=1]");
		
		if( element != null ) {
			element.attribute("id").setValue("11");
			element.attribute("price").setValue("456789");
		}
		
		XMLWriter writer = new XMLWriter(new FileOutputStream(new File("d:/books.xml")));
		writer.write(document);
		writer.close();
		
		
		
	}

}
