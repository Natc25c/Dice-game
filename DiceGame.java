import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Player player1 = new Player("", 0, 0); //Skapar en ny spelare med tomt namn, 0 poäng och 0 tärningar
        
        System.out.println("---- Välkommen till Tärningsspelet! --");
        System.out.println("I detta spel kan du rulla tärningar och samla poäng.");
        System.out.println("Du kan snart välja hur många sidor din tärning har och antalet rundor du vill spela.");
        System.out.println("Men först, vad heter du?");
        player1.setNamn(scanner.nextLine());
        System.out.println("Hej " + player1.getNamn() + "!");

        System.out.println("Hur många rundor vill du spela? Du kan max spela 20 rundor.");
        int antalRundor = scanner.nextInt(); //Läser in antalet rundor som användaren vill spela
        while (antalRundor < 1 || antalRundor > 20) { // Ser till så spelaren inte väljer fler än 20 rundor 
            System.out.println("Ogiltigt val. Välj ett antal mellan 1 och 20.");
            antalRundor = scanner.nextInt();
        }

        System.out.println("Hur många sidor har din tärning? Du kan välja mellan 2 och 100 sidor.");
        int val = scanner.nextInt(); //Läser in antalet sidor som användaren vill ha på sin tärning
        while (val < 2 || val > 100) { // Ser till så spelaren inte väljer färre än 2 eller fler än 100 sidor
            System.out.println("Ogiltigt val. Välj ett antal mellan 2 och 100.");
            val = scanner.nextInt();
        }
        int antalSidor = val;
        Dice dice = new Dice(antalRundor, antalSidor); //Skapar en ny tärning med det antal sidor som användaren vill ha

        scanner.nextLine(); 
        for (int i = 0; i < dice.getRounds(); i++) {
            System.out.println("Tryck Enter för att spela runda " + (i + 1) + ".");
            scanner.nextLine(); // Väntar på att användaren trycker Enter
            System.out.println("Vad tror du tärningen kommer landa på?");
            int gissning = scanner.nextInt();
            scanner.nextLine();

            int result = player1.rollDice(dice);
            if (gissning == result) {
                System.out.println("Grattis! Du gissade rätt!");
                player1.increaseScore(1); // Ger spelaren en poäng för en rätt gissning
            } else {
                System.out.println("Tyvärr, du gissade fel.");
            }
            System.out.println("Tärningen landade på: " + result);
        }

        System.out.println("Spelet är nu slut! Totalt fick du " + player1.getDieValue() + " poäng.");
        scanner.close();

    }
}
