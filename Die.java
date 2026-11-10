import java.util.Random;

public class Die {
    private final int rounds;
    private final int sides;
    private final Random random = new Random();
    private int lastRoll;

    public Die(int rounds, int sides) {
        try {
            if (rounds < 0) {
                throw new IllegalArgumentException("Du kan inte ha ett negativt antal rundor.");
            }
            if (sides < 2) {
                throw new IllegalArgumentException("En tärning måste ha minst 2 sidor.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e; 
        }
        this.rounds = rounds;
        this.sides = sides;
    }

    public void roll() {
        lastRoll = random.nextInt(sides) + 1;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int getRounds() {
        return rounds;
    }

    public int getSides() {
        return sides;
    }
   
}
