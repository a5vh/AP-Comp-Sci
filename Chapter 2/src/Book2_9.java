/**
 * Created by 19augusthummert on 9/19/2017.
 */
import java.util.Scanner;

public class Book2_9 {
    public static void main(String[] args) {
        String food, animal, first, last, color;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your favorite color");
        color = scan.nextLine();
        System.out.println("Enter your favorite food.");
        food = scan.nextLine();
        System.out.println("Enter your favorite animal");
        animal = scan.nextLine();
        System.out.println("Enter the first name of one of your relatives or friends.");
        first = scan.nextLine();

        System.out.println("I had a dream that " + first + " ate a " + color
                            + " " + animal + " and said it tasted like a " + food);
    }
}
