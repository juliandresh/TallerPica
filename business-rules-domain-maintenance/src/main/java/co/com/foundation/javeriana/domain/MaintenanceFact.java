package co.com.foundation.javeriana.domain;

public class MaintenanceFact {
	private boolean skipMaintenance;
	private int fuelPercentage;
	private String status;
	
	
	public boolean isSkipMaintenance() {
		return skipMaintenance;
	}
	
	public void setSkipMaintenance(boolean skipMaintenance) {
		this.skipMaintenance = skipMaintenance;
	}
	
	public int getFuelPercentage() {
		return fuelPercentage;
	}
	
	public void setFuelPercentage(int fuelPercentage) {
		this.fuelPercentage = fuelPercentage;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
