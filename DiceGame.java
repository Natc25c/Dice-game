import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Player player1 = new Player("", 0, 0, 0); //Skapar en ny spelare med tomt namn, 0 poäng och 0 tärningar
        
        System.out.println("---- Välkommen till Tärningsspelet! --");
        System.out.println("I detta spelet kan du rulla tärningar och samla poäng.");
        System.out.println("Du kan snart välja hur många sidor din tärning har och antalet rundor du vill spela.");
        System.out.println("Men först, vad heter du?");
        player1.setNamn(scanner.nextLine());
        System.out.println("Hej " + player1.getNamn() + "!");

        System.out.println("Hur många rundor vill du spela?");
        int antalRundor = scanner.nextInt(); //Läser in antalet rundor som användaren vill spela
        player1.setAntalRundor(antalRundor);

        System.out.println("Hur många sidor har din tärning?");
        int val = scanner.nextInt(); //Läser in antalet sidor som användaren vill ha på sin tärning
        int antalSidor = val;

        Dice dice = new Dice(1, antalSidor); //Skapar en ny tärning med 1 tärning och det antal sidor som användaren valt

        int total = dice.roll();

    }
}
