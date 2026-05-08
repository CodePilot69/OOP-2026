import java.util.ArrayList;

public class Tournament<T> {
    private ArrayList<T> participants;

    public Tournament() {
        this.participants = new ArrayList<>();
    }

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public ArrayList<T> getParticipants() {
        return participants;
    }

    public void showAll() {
        for (T p : participants) {
            System.out.println(p);
        }
    }
}