import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("", 0, 0); //Skapar en ny spelare med tomt namn, 0 poäng och 0 tärningar

        System.out.println("Vad heter du?");
        player1.setNamn(scanner.nextLine()); //Setter spelarens namn till det som användaren skriver in
        System.out.println("Hej " + player1.getNamn());
        System.out.println("Hur många tärningar vill du använda?");
        int antalTärningar = scanner.nextInt(); //Läser in antalet tärningar som användaren vill använda
        player1.setAntalTärningar(antalTärningar);

        int antalSidor;
        while (true) { // Loopar tills användaren gör ett giltigt val av vilken tärning som ska användas
            System.out.println("Välj tärning:");
            System.out.println("1. D6");
            System.out.println("2. D10");
            System.out.println("3. D20");
            System.out.println("4. D100");

            int val = scanner.nextInt();
            if (val == 1) {
                antalSidor = 6;
                break;
            } else if (val == 2) {
                antalSidor = 10;
                break;
            } else if (val == 3) {
                antalSidor = 20;
                break;
            } else if (val == 4) {
                antalSidor = 100;
                break;
            }

            System.out.println("Ogiltigt val. Välj 1, 2, 3 eller 4.");
        }
        Dice dice = new Dice(player1.getAntalTärningar(), antalSidor);
        System.out.println("Du har valt " + player1.getAntalTärningar() + " tärningar med " + antalSidor + " sidor.");

        // lägg till en loop här för att låta spelaren rulla tärningarna flera gånger om de vill
        int total = dice.roll();
        System.out.println("Du rullade totalt: " + total);
        player1.addPoints(total);

        System.out.println("Dina totala poäng är nu: " + player1.getPoints());
        scanner.close();
    }
}