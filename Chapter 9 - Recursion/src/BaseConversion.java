/**
 * Created by 19augusthummert on 3/29/2018.
 */
// ******************************************************************
// BaseConversion.java
//
// Recursively converts an integer from base 10 to another base
// ******************************************************************
import java.util.Scanner;
public class BaseConversion
{
    public static void main(String[]args)
    {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a number?");
        int num = scan.nextInt();
        System.out.println("What is the base you want it converted to?");
        int b = scan.nextInt();
        System.out.println(num + convert(num,b)+ "(base " + b + ")");


    }



    public static String convert (int num, int b)
    {
        int quotient; // the quotient when num is divided by base b
        int remainder; // the remainder when num is divided by base b
        quotient = num/b;
        remainder = num%b;
        if (quotient == 0 ) //fill in base case
        {
            return ("(base 10) = " + remainder );
        }
        else
        {
            // Recursive step: the number is the base b representation of
            // the quotient concatenated with the remainder

            return (convert(quotient, b)) + remainder;


        }
    }

}