package co.com.foundation.mtx.filter.throttle;

import co.com.foundation.mtx.filter.model.FilterCriteriaDTO;

public class WorkItem {

	private Object xmlContent;
	private boolean result;
	private FilterCriteriaDTO criteriaDTO;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Object getXmlContent() {
		return xmlContent;
	}

	public void setXmlContent(Object xmlContent) {
		this.xmlContent = xmlContent;
	}

	public FilterCriteriaDTO getCriteriaDTO() {
		return criteriaDTO;
	}

	public void setCriteriaDTO(FilterCriteriaDTO criteriaDTO) {
		this.criteriaDTO = criteriaDTO;
	}

}
