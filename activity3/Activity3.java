package activity3;
import java.time.LocalDateTime;

public class Activity3 {
    public class SecretAgent {
        private String agentId;
        private String codeName;
        private int clearanceLevel;
        private boolean onMission;
        private LocalDateTime lastMissionCompletionTime;

        public SecretAgent(String agentId, String codeName, int clearanceLevel) {

            this.agentId = agentId;
            this.codeName = codeName;
            this.clearanceLevel = clearanceLevel;
            this.onMission = false;
            this.lastMissionCompletionTime = null;
        }

        public String getAgentName() {
            return agentId;
        }

        public String getCodeName() {
            return codeName;
        }

        public int getClearanceLevel() {
            return clearanceLevel;
        }

        public boolean GetOnMission() {
            return onMission;

        }

        public LocalDateTime lastMissionCompletionTime() {
            return lastMissionCompletionTime;
        }

        public void setClearanceLevel(int level) {
            if (level > 1 || level <= 5) {
                this.clearanceLevel = level;
            } else {
                System.out.println("Invalid clearance level.");
            }

        }

        public boolean startMission(){
            return onMission = true;
        }
        public boolean completeMission(){
            return onMission = false;
        }
        
    }
}
