/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.crew.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author sebastianpacheco
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Maintenance {
    
    @XmlElement
    private int fuelPercentage;
    
    @XmlElement
    private String undercarriageStatus;

    /**
     * @return the fuelPercentage
     */
    public int getFuelPercentage() {
        return fuelPercentage;
    }

    /**
     * @param fuelPercentage the fuelPercentage to set
     */
    public void setFuelPercentage(int fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    /**
     * @return the undercarriageStatus
     */
    public String getUndercarriageStatus() {
        return undercarriageStatus;
    }

    /**
     * @param undercarriageStatus the undercarriageStatus to set
     */
    public void setUndercarriageStatus(String undercarriageStatus) {
        this.undercarriageStatus = undercarriageStatus;
    }
}
