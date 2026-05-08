import java.util.ArrayList;

public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {
    private String name;
    private int score;
    private ArrayList<String> trophies;

    public Athlete(String name, int score) {
        this.name = name;
        this.score = score;
        this.trophies = new ArrayList<>();
    }

    public void addTrophy(String trophy) {
        trophies.add(trophy);
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is naglalro.");
    }

    @Override
    public int compareTo(Athlete other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public Athlete clone() {
        try {
            Athlete cloned = (Athlete) super.clone();
            cloned.trophies = new ArrayList<>(this.trophies);
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return name + " (Score: " + score + ") Trophiess " + trophies;
    }
}