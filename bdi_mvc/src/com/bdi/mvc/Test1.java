package com.bdi.mvc;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Document;

public class Test1 {
	public static void main(String[] args) {
		String path = "/config/food.xml";
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputStream is = Test1.class.getResourceAsStream(path);
			Document document = db.parse(is);
			
			NodeList foods = document.getElementsByTagName("foods");
			for(int i=0;i<foods.getLength();i++) {
				Node food = foods.item(i);
				System.out.println(food.getTextContent());
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
