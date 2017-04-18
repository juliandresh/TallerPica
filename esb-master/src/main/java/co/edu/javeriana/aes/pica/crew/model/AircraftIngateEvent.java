/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.crew.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebastianpacheco
 */
@XmlRootElement
public class AircraftIngateEvent {
    
    private Date eventDate;
    
    private IncidentReport incidentReport;
    
    
    private Maintenance maintenance;
    
    
    private CrewPlaningChanges crewPlaningChanges;

    /**
     * @return the eventDate
     */
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * @return the incidentReport
     */
    public IncidentReport getIncidentReport() {
        return incidentReport;
    }

    /**
     * @param incidentReport the incidentReport to set
     */
    public void setIncidentReport(IncidentReport incidentReport) {
        this.incidentReport = incidentReport;
    }

    /**
     * @return the maintenance
     */
    public Maintenance getMaintenance() {
        return maintenance;
    }

    /**
     * @param maintenance the maintenance to set
     */
    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    /**
     * @return the crewPlaningChanges
     */
    public CrewPlaningChanges getCrewPlaningChanges() {
        return crewPlaningChanges;
    }

    /**
     * @param crewPlaningChanges the crewPlaningChanges to set
     */
    public void setCrewPlaningChanges(CrewPlaningChanges crewPlaningChanges) {
        this.crewPlaningChanges = crewPlaningChanges;
    }
}
