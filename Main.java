import java.util.Scanner;

public class Main {

    public static int sum = 0;

    public static void main(String[] args) {
        Deck myCard = new Deck();
        myCard.initialise();

        System.out.println(myCard.hit());
        Scanner obj = new Scanner(System.in);
        System.out.println("Type hit if want to hit");
        String answer = obj.nextLine();

        while(answer.equalsIgnoreCase("hit")) {
            System.out.println(myCard.hit());
            System.out.println("Type hit if want to hit");
            answer = obj.nextLine();
        }
    }
}
