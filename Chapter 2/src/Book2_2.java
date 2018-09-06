/**
 * Created by 19augusthummert on 9/18/2017.
 */
import java.util.Scanner;

public class Book2_2 {

    public static void main(String[] args) {

        String st1, st2, st3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two phrases on two separate lines below...");

        st1 = scan.nextLine();
        st2 = scan.nextLine();

        System.out.println("The length of " + st1 + " is: " + st1.length());
        System.out.println("The length of " + st2 + " is: " + st2.length());

        st3 = st1 + st2;
        System.out.println("The length of " + st3 + " is: " + st3.length());
    }
}
