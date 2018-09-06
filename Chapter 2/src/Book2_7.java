/**
 * Created by 19augusthummert on 9/19/2017.
 */
import java.util.Scanner;

public class Book2_7 {

    public static void main(String[] args) {
        String hate, love;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text.");
        hate = scan.nextLine();
        System.out.println("I have rephrased that line into something better.");
        love = hate.replace("hate", "love");
        System.out.println(love);
    }
}
