/**
 * Created by 19augusthummert on 9/5/2017.
 */
import java.util.Scanner;

public class Average_3 {

    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

        int grade1, grade2,grade3;
        double average;
        

        System.out.println("Enter grade 1..");
        grade1 = scan.nextInt();

        System.out.println("Enter grade 2..");
        grade2 = scan.nextInt();

        System.out.println("Enter grade 3..");
        grade3 = scan.nextInt();

        average = (grade1 + grade2 + grade3) /3;
        System.out.println("The average is " + average);


    }
}
