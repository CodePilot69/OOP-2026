import java.util.Collections;

public class TournamentDemo {
    public static void main(String[] args) {
        Tournament<Athlete> tournament = new Tournament<>();

        Athlete a1 = new Athlete("kaltik", 67);
        Athlete a2 = new Athlete("yobab", 69);
        Athlete a3 = new Athlete("baks", 88);

        tournament.addParticipant(a1);
        tournament.addParticipant(a2);
        tournament.addParticipant(a3);

        Collections.sort(tournament.getParticipants());
        tournament.showAll();

        Athlete original = a2;
        Athlete copy = original.clone();
        copy.addTrophy("Gold Cup");

        System.out.println("Original: " + original);
        System.out.println("Clone: " + copy);

        original.reportStatus();
        System.out.println("Scorevalid: " + Competitor.isValidScore(105));
    }
}