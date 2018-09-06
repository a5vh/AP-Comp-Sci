/**
 * Created by 19augusthummert on 9/8/2017.
 */
import java.util.Scanner;

public class Book2_4 {
    public static void main(String[] args) {
        int number, div, thousands, hundreds, tens, ones;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a four digit number below...");

        number = scan.nextInt();
        thousands = number / 1000;
        hundreds = (number % 1000) /100;
        tens = ((number % 1000) % 100) / 10;
        ones = ((number % 1000) % 100) % 10;

        System.out.println(thousands);
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
    }
}
