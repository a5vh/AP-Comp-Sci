/**
 * Created by 19augusthummert on 2/20/2018.
 */
import java.util.Scanner;
public class Book7_1 {

    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("How many integers will you enter?");
        int size = scan.nextInt();

        double array[] = new double[size];

        System.out.println("Enter " + size + " integers, one per line.");
        for (int i = 0; i < size; i++)
        {
            double num = scan.nextInt();
            array[i] = num;
            sum += num;
        }

        System.out.println("The sum is " + sum);

        for (int i = 0; i < size; i++)
        {
            double percent = ((array[i]/sum)*100);
            System.out.println(array[i] + " which is " + percent + "% of the sum");
        }

    }
}
