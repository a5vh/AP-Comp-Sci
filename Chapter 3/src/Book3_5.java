/**
 * Created by augusthummert on 10/11/17.
 */
import java.util.Scanner;

public class Book3_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int int1 , greatest, smallest, count;
        double average;

        greatest = 0;
        smallest = 0;
        average = 0;
        count = 0;
        int1 = 0;

        System.out.println("Type in your integers.");


        while (int1 != -1){
            int1 = scan.nextInt();

            if (int1 > greatest){
                greatest = int1;
            }

            if (int1 < smallest) {
                smallest = int1;
            }

            count++;
            average += int1;

        }

        average = average / count;

        System.out.println("Largest: " + greatest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Average: " + average);

    }
}
