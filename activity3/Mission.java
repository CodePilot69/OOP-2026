package activity3;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        Random random = new Random();
        String[] MissionTargets = { """
                "Retrieve stolen data"
                "Infiltrate enemy base"
                "Rescue hostage"
                """ };

               
        missionTarget = MissionTargets[random.nextInt(MissionTargets.length)];

        
        difficulty = random.nextInt(10) + 1;

       
        int daysToAdd = random.nextInt(24) + 7;
        missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

  
    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }

    
    public void displayMissionBriefing() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + missionDeadline.format(formatter));
    }

    
    public static void main(String[] args) {
        Mission mission = new Mission();
        mission.displayMissionBriefing();
    }
}


    


