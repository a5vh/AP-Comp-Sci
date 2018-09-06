/**
 * Created by 19augusthummert on 10/20/2017.
 */
import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {

        int x, y, answer;
        Scanner scan = new Scanner(System.in);
        answer = 1;
        y = 1;

        System.out.print("Enter an integer: ");
        x = scan.nextInt();

        while (x < 0) {
            System.out.println("That number is a negative, and will therefore not work. Please type a positive number");
            x = scan.nextInt();
        }

        if (x == 0) System.out.print(1);

        while (x >= y)
        {
            System.out.print(y + "*");
            answer = answer * y;
            y += 1;
        }

        System.out.print("=" + answer);
    }
}
