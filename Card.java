import java.util.*;
class Card.javaCard {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("2"); //Adding object in arraylist
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("J");
        list.add("Q");
        list.add("K");
        list.add("A");

        ArrayList<String> list2 = new ArrayList<String>();//Creating arraylist

        list2.add("Heart");
        list2.add("Spade");
        list2.add("Diamond");
        list2.add("Club");

        Random rand = new Random();
        String randomElement = list.get(rand.nextInt(list.size()));
        String randomElement2 = list2.get(rand.nextInt(list2.size()));

        System.out.print(randomElement);
        System.out.print(" ");
        System.out.println(randomElement2);
    }
}