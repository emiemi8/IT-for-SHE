
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int sum = 0;
    private static final Set<String> VALUES = Set.of("K", "Q", "J");
    static LinkedList<Card> hand = new LinkedList<>();

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        myDeck.initialise();

        Card newCard = myDeck.hit();
        hand.add(newCard);

        System.out.print(newCard + " ");
        System.out.println(countPoints(newCard));
        System.out.println("Your hand: " + hand);


        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type hit if want to hit");
        String answer = inputScanner.nextLine();


        while (answer.equalsIgnoreCase("hit")) {
            Card newCard1 = myDeck.hit();
            hand.add(newCard1);

            System.out.print(newCard1 + " ");
            System.out.println(countPoints(newCard1));
            System.out.println("Your hand: " + hand);

            if(sum == 21){
                System.out.println("Victory!");
                return;
            }
            else if (sum >21){
                System.out.println("Defeat...");
                return;
            }

            System.out.println("Type hit if want to hit");
            answer = inputScanner.nextLine();
        }

    }

    public static String countPoints(Card card){
        String valueOfCard = card.value;

        if(VALUES.contains(valueOfCard)) {
            sum= sum+10;
        } else if (valueOfCard.equals("A")) {
            sum= sum+11;
        }
        else{
            sum= sum+Integer.parseInt(valueOfCard);
        }
        return "Sum = " + sum;
        }
}