import java.util.Random;

public class Dice {
    private final int amount;
    private final int sides;
    private final Random random = new Random();

    public Dice(int amount, int sides) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Du kan inte ha ett negativt antal tärningar.");
            }
            if (sides < 2) {
                throw new IllegalArgumentException("En tärning måste ha minst 2 sidor.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            throw e; 
        }
        this.amount = amount;
        this.sides = sides;
    }

    public int roll() {
    int total = 0;
    for (int i = 0; i < amount; i++) {
        int result = random.nextInt(sides) + 1;
        System.out.println("Tärning " + (i + 1) + ": " + result);
        total += result;
    }
    return total;
    }

    public int getAmount() {
        return amount;
    }

    public int getSides() {
        return sides;
    }
}
