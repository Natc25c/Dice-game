public class Player {
    private String namn;
    private int points;
    private int antalTärningar;

    public Player(String namn, int points, int antalTärningar) {
        this.namn = namn;
        this.points = points;
        this.antalTärningar = antalTärningar;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    public void setAntalTärningar(int antalTärningar) {
        this.antalTärningar = antalTärningar;
    }
   
    public void increaseScore(int poäng) {
        this.points += poäng;
    }

    public int rollDice(Die die) {
        die.roll();
        return die.getLastRoll();
    }

    public int getDieValue() {
        return points;
    }

    public int getAntalTärningar() {
        return antalTärningar;
    }
   

    public String getNamn() {
        return namn;
    }
}
