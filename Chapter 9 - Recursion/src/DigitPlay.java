/**
 * Created by 19augusthummert on 4/9/2018.
 */
// *******************************************************************
// DigitPlay.java
//
// Finds the number of digits in a positive integer.
// *******************************************************************
import java.util.Scanner;
public class DigitPlay
{
    public static void main (String[] args)
    {
        int num; //a number
        Scanner scan = new Scanner(System.in);
        System.out.println ();

        System.out.println("How many numbers would you like to test?");
        int numTimes = scan.nextInt();


        /**
         (num < 0)
            System.out.println ( num + " isn't positive -- start over!!");
        else
        {
         **/
// Call numDigits to find the number of digits in the number
// Print the number returned from numDigits
        for(int i = 0; i < numTimes; i++)
        {
            System.out.print ("Please enter a positive integer: ");
            num = scan.nextInt ();
            int sum = sumDigits(num);
            System.out.println ("The sum is: " + sum);
            if (sum % 7 == 0)
            {
                System.out.println("Code Checks out.");
            }

            else System.out.println("Code doesn't check out.");
        }
    }
    // -----------------------------------------------------------
// Recursively counts the digits in a positive integer
// -----------------------------------------------------------
    public static int numDigits(int num)
    {
        if (num < 10)
            return (1);
        else
            return (1 + numDigits(num/10));
    }

    public static int sumDigits(int num)
    {
        if (num < 10)
        {
            return num;
        }
        else
        {
            return num % 10 + sumDigits(num /10);
        }
    }
}