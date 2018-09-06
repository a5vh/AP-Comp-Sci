/**
 * Created by 19augusthummert on 10/9/2017.
 */
import java.util.Scanner;

public class Book3_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numx, numy;

        System.out.print("Enter the number you are dividing: ");
        numx = scan.nextInt();
        System.out.print("Enter the number you are dividing by: ");
        numy = scan.nextInt();

        if (numx % numy == 0) System.out.println("The numbers are divisible by each other.");
        if (numx % numy != 0) System.out.println("The numbers aren't divisible by each other.");

    }
}
