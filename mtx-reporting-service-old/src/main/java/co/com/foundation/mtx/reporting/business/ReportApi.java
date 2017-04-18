package co.com.foundation.mtx.reporting.business;

import java.util.List;
import java.util.Optional;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.com.foundation.mtx.reporting.model.MaintenanceExecution;
import co.com.foundation.mtx.reporting.model.Operator;
import co.com.foundation.mtx.reporting.model.ReportDTO;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ReportApi {

	@PersistenceContext
	private EntityManager entityManager;

	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public ReportDTO generate() {

		ReportDTO reportDTO = new ReportDTO();
		String query = "select me from MaintenanceExecution me";
		List<MaintenanceExecution> list = entityManager.createQuery(query, MaintenanceExecution.class).getResultList();

		list.forEach((me) -> {

			System.out.println(
					"Processing MaintenanceExecution " + me + " with total notes: " + me.getOperatorList().size());

			evaluateOperators(reportDTO, me.getOperatorList());
			evaluateCost(reportDTO, me.getOperatorList());
			reportDTO.addMaintenanceCount();
			
		});

		return reportDTO;
	}

	// --------------------------

	private void evaluateCost(final ReportDTO reportDTO, List<Operator> operators) {

		operators.stream().forEach((o) -> {

			Optional<Operator> optional = Optional.ofNullable(o);
			if (optional.isPresent()) {

				String query = "select op from Operator op where op.id = :ID";
				Operator operator = entityManager.createQuery(query, Operator.class)
						.setParameter("ID", o.getId())
						.getSingleResult();
				
				System.out.println( "Processing operator salary : " + operator );
				reportDTO.addCost(operator.getCharge() );
			}

		});
		
	}
	
	// --------------------------

	private void evaluateOperators(ReportDTO reportDTO, List<Operator> operators) {

		operators.stream().forEach((o) -> {

			Optional<Operator> optional = Optional.ofNullable(o);
			if (optional.isPresent()) {

				String query = "select op from Operator op where op.id = :ID";
				Operator operator = entityManager.createQuery(query, Operator.class)
						.setParameter("ID", o.getId())
						.getSingleResult();
				
				System.out.println( "Processing operator: " + operator );
				if( !reportDTO.getOperators().contains( operator.getFullName() ) ){
					reportDTO.getOperators().add( operator.getFullName() );
				}
			}

		});

	}
}
