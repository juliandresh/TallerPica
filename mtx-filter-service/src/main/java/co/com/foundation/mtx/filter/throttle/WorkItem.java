package co.com.foundation.mtx.filter.throttle;

import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;
import co.com.foundation.mtx.filter.operations.info.AircraftInformation;

public class WorkItem {

	//private Object xmlContent;
	private boolean result;
	private FilterCriteriaDTO criteriaDTO;
	private AircraftInformation xmlContent1;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	/*public Object getXmlContent() {
		return xmlContent;
	}

	public void setXmlContent(Object xmlContent) {
		this.xmlContent = xmlContent;
	}*/

	public FilterCriteriaDTO getCriteriaDTO() {
		return criteriaDTO;
	}

	public void setCriteriaDTO(FilterCriteriaDTO criteriaDTO) {
		this.criteriaDTO = criteriaDTO;
	}

	public AircraftInformation getXmlContent() {
		return xmlContent1;
	}

	public void setXmlContent(AircraftInformation xmlContent1) {
		this.xmlContent1 = xmlContent1;
	}
}
