/**
 * Created by 19augusthummert on 10/3/2017.
 */
import java.util.Scanner;

public class DeansList {

    public static void main(String[] args) {
        Double gpa;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your gpa.");
        gpa = scan.nextDouble();
        if (gpa > 3.5)
        {
            System.out.print("Congratulations-you made the Dean's List!");
        }
        else
        {
            System.out.print("Sorry you didn't make the Dean's List");
        }


    }
}
