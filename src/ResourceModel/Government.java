/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResourceModel;


public class Government {
    
    public int partyLeaderId;
    public String partyLeaderName;
    public String party;
    public String state;
    
    public int getPartyLeaderId() {
        return partyLeaderId;
    }
    
    @Override
    public String toString() {
            return String.valueOf(partyLeaderId);
    }
        
    public void setPartyLeaderId(int partyLeaderId) {
        this.partyLeaderId = partyLeaderId;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    
    public String getPartyLeaderName() {
        return partyLeaderName;
    }

    public void setPartyLeaderName(String partyLeaderName) {
        this.partyLeaderName = partyLeaderName;
    }
    
    
}
