/**
 * Created by 19augusthummert on 1/25/2018.
 */
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int average;
        int count = 0;
        int max = 0;
        int min = 10000;
        int idmax = 0;
        int idmin = 0;

        Scanner scan = new Scanner(System.in);

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;


        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            count++;

            if (sales[i] > max)
            {
                max = sales[i];
                idmax = i;
            }

            if (sales[i] < min)
            {
                min = sales[i];
                idmin = i;
            }

        }


        average = sum / count;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + average);
        System.out.println("\nMax Sale: " + max + "\nID: " + idmax);
        System.out.println("\nMin Sale: " + min + "\nID: " + idmin);

        System.out.println("Enter a value to be compared.");
        int numToBeCompared = scan.nextInt();
        for (int w=0; w < sales.length; w++)
        {
            if (sales[w] > numToBeCompared)
            {

            }
        }
    }
}