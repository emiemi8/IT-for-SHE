import java.util.Set;

/**
 * Clas representing a card. It has two parameters the color and the value.
 */
class Card {
    String value;

    Suite color;

    Card(String value, Suite color){
        this.value=value;
        this.color=color;
    }


    private static final Set<String> VALUES = Set.of("K", "Q", "J");

    @Override
    public String toString() {

        if(VALUES.contains(value)) {
            Main.sum= Main.sum+10;
        } else if (value.equals("A")) {
            Main.sum= Main.sum+11;
        }
        else{
            Main.sum= Main.sum+Integer.parseInt(value);
        }

        return "Card{" +
                "value='" + value + '\'' +
                ", color=" + color +
                '}'+ " sum = " + Main.sum ;
    }
}

/**
 * Enum with every possible color of a card
 */
enum Suite {
    Heart,
    Spade,
    Diamond,
    Clubs
}