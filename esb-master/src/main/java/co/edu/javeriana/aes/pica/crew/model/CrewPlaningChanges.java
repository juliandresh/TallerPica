/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.crew.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sebastianpacheco
 */
@XmlRootElement
public class CrewPlaningChanges {
    
    
    private boolean applyChangesOnCrewMembers;
    
    
    private int totalCrewMemberRequired;
    
    
    private boolean changePilot;

    public boolean isApplyChangesOnCrewMembers() {
        return applyChangesOnCrewMembers;
    }

    public void setApplyChangesOnCrewMembers(boolean applyChangesOnCrewMembers) {
        this.applyChangesOnCrewMembers = applyChangesOnCrewMembers;
    }

    public int getTotalCrewMemberRequired() {
        return totalCrewMemberRequired;
    }

    public void setTotalCrewMemberRequired(int totalCrewMemberRequired) {
        this.totalCrewMemberRequired = totalCrewMemberRequired;
    }

    public boolean isChangePilot() {
        return changePilot;
    }

    public void setChangePilot(boolean changePilot) {
        this.changePilot = changePilot;
    }
}
