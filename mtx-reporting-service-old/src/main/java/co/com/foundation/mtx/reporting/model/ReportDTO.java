package co.com.foundation.mtx.reporting.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReportDTO {

	private List<String> operators;
	private BigInteger totalCost;
	private int totalMaintenanceDone;

	public ReportDTO() {
		super();
		totalCost = new BigInteger("0");
		operators = new ArrayList<>();
		totalMaintenanceDone = 0;
	}

	public void addCost( BigInteger cost ){
		totalCost = totalCost.add(cost);
	}
	
	public void addMaintenanceCount(){
		totalMaintenanceDone++;
	}
	
	public List<String> getOperators() {
		return operators;
	}

	public void setOperators(List<String> operators) {
		this.operators = operators;
	}

	public BigInteger getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(BigInteger totalCost) {
		this.totalCost = totalCost;
	}

	public int getTotalMaintenanceDone() {
		return totalMaintenanceDone;
	}

	public void setTotalMaintenanceDone(int totalMaintenanceDone) {
		this.totalMaintenanceDone = totalMaintenanceDone;
	}

}
