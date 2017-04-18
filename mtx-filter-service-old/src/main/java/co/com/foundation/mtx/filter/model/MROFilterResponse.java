package co.com.foundation.mtx.filter.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MROFilterResponse {

	private boolean isValidAircraft;

	public boolean getIsValidAircraft() {
		return isValidAircraft;
	}

	public void setIsValidAircraft(boolean isValidAircraft) {
		this.isValidAircraft = isValidAircraft;
	}

}
