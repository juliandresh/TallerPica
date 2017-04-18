package co.com.foundation.javeriana.model;

import javax.xml.bind.annotation.XmlRootElement;


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
