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

    @Override
    public String toString() {
        return "Card{" +
                "value='" + value + '\'' +
                ", color=" + color +
                '}';
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