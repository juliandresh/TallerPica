package co.com.foundation.javeriana.sandbox.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.foundation.javeriana.sandbox.component.xml.Unmarshaller;
import co.com.foundation.javeriana.sandbox.model.output.FlightLegResponse;

@Path("/flights")
@Component
public class FlightsService {
 
	@Autowired
	private Unmarshaller<FlightLegResponse> unmarshaller;
	
	@GET
	@Path("/search")
	@Produces({ MediaType.APPLICATION_XML })
	public FlightLegResponse search() throws JAXBException {
		return unmarshaller.unmarshall();
	}

}
