package co.com.foundation.mtx.filter.unmarshaller.impl;

import java.io.File;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXBUnmarshaller
{
	private static JAXBContext jaxbContext;
	    
	public static JAXBContext getJAXBInstance(Class<?> classObject)
	{
		if(jaxbContext == null)
		{
			jaxbContext = initContext(classObject);
		}
		return jaxbContext;
	}
	
	private final static JAXBContext initContext(Class<?> classObject) 
	{
        try 
        {
			return JAXBContext.newInstance(classObject);
		} 
        catch (JAXBException e) 
        {
			return null;
		}
    }
	
	public Class<?> unmarshall(Class<?> classObject, File file) {
		try {
			jaxbContext = getJAXBInstance(classObject);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			return (Class<?>) jaxbUnmarshaller.unmarshal(file);
		} 
		catch (JAXBException e) {
			return null;
		}		
	}
}
