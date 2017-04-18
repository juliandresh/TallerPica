package co.com.foundation.mtx.filter.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MROFilterRequest {

	private String aircraftType;
	private int aicraftModel;

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public int getAicraftModel() {
		return aicraftModel;
	}

	public void setAicraftModel(int aicraftModel) {
		this.aicraftModel = aicraftModel;
	}

}
