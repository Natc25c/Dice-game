public class Player {
    private String namn;
    private int points;
    private int antalTärningar;
    private int antalRundor;

    public Player(String namn, int points, int antalTärningar, int antalRundor) {
        this.namn = namn;
        this.points = points;
        this.antalTärningar = antalTärningar;
        this.antalRundor = antalRundor;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    public void setAntalTärningar(int antalTärningar) {
        this.antalTärningar = antalTärningar;
    }
    public void setAntalRundor(int antalRundor) {
        this.antalRundor = antalRundor;
    }
    public void addPoints(int poäng) {
        this.points += poäng;
    }

    public int getPoints() {
        return points;
    }

    public int getAntalTärningar() {
        return antalTärningar;
    }
    public int getAntalRundor() {
        return antalRundor;
    }

    public String getNamn() {
        return namn;
    }
}
