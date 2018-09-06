/**
 * Created by 19augusthummert on 9/8/2017.
 */
import java.util.Scanner;

public class Book2_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int num1, num2, num3, average;
        System.out.println("Please enter 3 whole numbers on the line below...");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        average = (num1 + num2 + num3) / 3;
        System.out.println("The average of these numbers is " + average);


    }
}
