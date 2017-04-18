package co.com.foundation.mtx.reporting.services;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

import co.com.foundation.mtx.reporting.business.ReportApi;
import co.com.foundation.mtx.reporting.model.ReportDTO;

@WebService(targetNamespace = "http://mtx.enterprise/services/reporter")
public class ReportingWS {

	@EJB
	private ReportApi reportApi;
	
	public ReportingWS() {
		super();
	}

	@WebMethod(operationName = "generate", action = "generate")
	public ReportDTO generate() {
		return reportApi.generate();
	}

}
