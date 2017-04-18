package co.com.foundation.mtx.filter.services;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import co.com.foundation.mtx.filter.business.FilterExecutor;
import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;
import co.com.foundation.mtx.filter.model.MROFilterRequest;
import co.com.foundation.mtx.filter.model.MROFilterResponse;

@WebService(targetNamespace="http://mtx.enterprise/services/filter")
public class FilterService {

	@EJB
	private FilterExecutor filterExecutor;
	
	public FilterService() {
		super(); 
	}

	@WebMethod(operationName="evaluateAircraft",action="evaluateAircraft")
	public MROFilterResponse evaluateAircraft( @WebParam(name="request") MROFilterRequest request ){
		
		FilterCriteriaDTO criteriaDTO = new FilterCriteriaDTO();
		criteriaDTO.setAicraftModel( request.getAicraftModel() );
		criteriaDTO.setAircraftType( request.getAircraftType() );
		
		MROFilterResponse response = new MROFilterResponse();
		response.setIsValidAircraft( filterExecutor.delegateFilterExecution(criteriaDTO) );
		return response;
	}
	
}
