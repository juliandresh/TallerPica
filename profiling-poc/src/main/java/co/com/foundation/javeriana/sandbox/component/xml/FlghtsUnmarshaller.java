package co.com.foundation.javeriana.sandbox.component.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Component;

import co.com.foundation.javeriana.sandbox.model.output.FlightLegResponse;

@Component
public class FlghtsUnmarshaller implements Unmarshaller<FlightLegResponse>{

	private static final String FILE_PATH = "C://data/input.xml";
	
	@Override
	public FlightLegResponse unmarshall() throws JAXBException {
		
		JAXBContext ctx = JAXBContext.newInstance("co.com.foundation.javeriana.sandbox.model.output");
		javax.xml.bind.Unmarshaller um = ctx.createUnmarshaller();
		FlightLegResponse response = (FlightLegResponse) um.unmarshal(new File(FILE_PATH));
		
		return response;
	}

}
