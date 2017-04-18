package co.com.foundation.javeriana.sandbox.component.xml;

import javax.xml.bind.JAXBException;

public interface Unmarshaller<O> {

	O unmarshall() throws JAXBException;
	
	
}
