package co.com.foundation.mtx.filter.business;

import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import co.com.foundation.mtx.filter.mediator.Mediator;
import co.com.foundation.mtx.filter.mediator.imp.ThrottleMediator;
import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;

@Singleton
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class FilterExecutor {

	private final Mediator<FilterCriteriaDTO,Boolean> mediator = ThrottleMediator.getInstance();
	
	public boolean delegateFilterExecution( final FilterCriteriaDTO criteriaDTO ){
		
		mediator.process(criteriaDTO);
		boolean response = mediator.process(criteriaDTO);
		return response;
	}
	
}
