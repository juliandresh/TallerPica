package co.com.foundation.mtx.filter.unmarshaller.impl;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;

import co.com.foundation.mtx.filter.unmarshaller.Unmarshaller;

public class DOMUnmarshaller implements Unmarshaller<String, Document> {

	public static DOMUnmarshaller newInstance(){
		return new DOMUnmarshaller();
	}
	
	@Override
	public Document unmarshall(String input) {
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(IOUtils.toInputStream(input, "UTF-8"));
			return doc;
		} catch (Exception e) {
			return null;
		}

	}

}
