package activity3;
import java.time.format.DateTimeFormatter;
import activity3.Activity3.SecretAgent;

public class Main {
    public static void main(String[] args) {
        SecretAgent agent = new SecretAgent ("069", "Tom Cruise", 5);


        System.out.println(" Agent Status ");
         System.out.println("Code Name: " + agent.getCodeName());
        System.out.println("Agent Name: " + agent.getAgentName());
        System.out.println("Clearance Level: " + agent.getClearanceLevel());
        System.out.println("On Mission: " + agent.GetOnMission());

        Mission mission = new Mission();
        mission.displayMissionBriefing();

        if(agent.getClearanceLevel() > mission.getDifficulty()){
            agent.startMission();
            System.out.println( get.agentId + );
        }
       
    }
}

        
    
    
