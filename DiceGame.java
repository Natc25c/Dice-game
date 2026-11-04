import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Player player1 = new Player("", 0, 0); //Skapar en ny spelare med tomt namn, 0 poäng och 0 tärningar
        
        System.out.println("---- Välkommen till Tärningsspelet! --");
        System.out.println("I detta spelet kan du rulla tärningar och samla poäng.");
        System.out.println("Du kan snart välja hur många sidor din tärning har och antalet rundor du vill spela.");
        System.out.println("Men först, vad heter du?");
        player1.setNamn(scanner.nextLine());
        System.out.println("Hej " + player1.getNamn() + "!");

        System.out.println("Hur många rundor vill du spela?");
        int antalRundor = scanner.nextInt(); //Läser in antalet rundor som användaren vill spela
        

        System.out.println("Hur många sidor har din tärning?");
        int val = scanner.nextInt(); //Läser in antalet sidor som användaren vill ha på sin tärning
        int antalSidor = val;
        Dice dice = new Dice(antalRundor, antalSidor); //Skapar en ny tärning med det antal sidor som användaren vill ha

        scanner.nextLine(); 
        for (int i = 0; i < dice.getRounds(); i++) {
            System.out.println("Tryck Enter för att spela runda " + (i + 1) + ".");
            scanner.nextLine();
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

        System.out.println("Totalt fick du " + player1.getDieValue() + " poäng.");
        System.out.println("Din poäng: " + player1.getDieValue());
        scanner.close();

    }
}
