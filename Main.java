import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static int sum = 0;

    //fragment do TODO:

    /*
    public static void main(String[] args) {
        Deck myCard = new Deck();
        myCard.initialise();
        myCard.hit();
    }*/


    public static void main(String[] args) {

        //TODO switch from using static methods to public methods from Deck class.
        LinkedList<Card> deck = new LinkedList<>();

        initialiseDeck(deck);

        System.out.println(getRandomCard(deck));
        Scanner obj = new Scanner(System.in);
        System.out.println("Type hit if want to hit");
        String answer = obj.nextLine();

        while(answer.equalsIgnoreCase("hit")) {
            System.out.println(getRandomCard(deck));
            System.out.println("Type hit if want to hit");
            answer = obj.nextLine();
        }

    }


    private static Card getRandomCard(LinkedList<Card> deck) {
        Collections.shuffle(deck);
        return deck.pop();
    }

    private static void initialiseDeck(List<Card> deck) {
        for (Suite suite : Suite.values()) {
            deck.add(new Card("2", suite));
            deck.add(new Card("3", suite));
            deck.add(new Card("4", suite));
            deck.add(new Card("5", suite));
            deck.add(new Card("6", suite));
            deck.add(new Card("7", suite));
            deck.add(new Card("8", suite));
            deck.add(new Card("9", suite));
            deck.add(new Card("10", suite));
            deck.add(new Card("J", suite));
            deck.add(new Card("Q", suite));
            deck.add(new Card("K", suite));
            deck.add(new Card("A", suite));
        }


    }

}
