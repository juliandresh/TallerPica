package co.com.foundation.javeriana.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IncidentsReport {
	
	private String description;
    private String summary;
    private int category;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
}
