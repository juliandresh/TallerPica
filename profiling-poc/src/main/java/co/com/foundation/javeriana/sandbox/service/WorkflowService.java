package co.com.foundation.javeriana.sandbox.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.foundation.javeriana.sandbox.component.workflow.WorkflowBusinessComponent;

@Path("/workflow")
@Component
public class WorkflowService {

	@Autowired
	private WorkflowBusinessComponent workflow;
	
	@GET
	@Path("/process")
	@Produces({ MediaType.APPLICATION_XML })
	public String processCreditRequest(){
		
		workflow.validateCredit();
		workflow.persistInformation();
		String tx = workflow.generateTransactionId();
		
		return "<transaction>"+tx+"</transaction>";
	}
}
