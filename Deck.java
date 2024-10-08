import java.util.Collections;
import java.util.LinkedList;


public class Deck {
    
    LinkedList<Card> cards = new LinkedList<>();
    
    public void initialise(){
        for (Suite suite: Suite.values()){
            cards.add(new Card("2", suite));
            cards.add(new Card("3", suite));
            cards.add(new Card("4", suite));
            cards.add(new Card("5", suite));
            cards.add(new Card("6", suite));
            cards.add(new Card("7", suite));
            cards.add(new Card("8", suite));
            cards.add(new Card("9", suite));
            cards.add(new Card("10", suite));
            cards.add(new Card("J", suite));
            cards.add(new Card("Q", suite));
            cards.add(new Card("K", suite));
            cards.add(new Card("A", suite));
        }
        Collections.shuffle(cards);
    }

    public Card hit() {
        return cards.pop();
    }
}
