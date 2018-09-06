/**
 * Created by 19augusthummert on 9/18/2017.
 */
import java.util.Scanner;

public class Book2_5 {

    public static void main(String[] args) {

        String num, print;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 4 digit number below...");
        num = scan.nextLine();

        System.out.println(num);
        print = num.substring(0, 1);
        System.out.println("\n" + print);
        print = num.substring(1, 2);
        System.out.println(print);
        print = num.substring(2, 3);
        System.out.println(print);
        print = num.substring(3, 4);
        System.out.println(print);

    }
}
