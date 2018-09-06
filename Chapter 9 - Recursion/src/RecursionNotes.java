/**
 * Created by 19augusthummert on 3/28/2018.
 */
import java.util.Scanner;
public class RecursionNotes {

    public static void main (String [] args)
    {
        System.out.println("What is your number?");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n)
    {
        if (n < 10)
        {
            return n;
        }
        else
        {
            return n % 10 + sumDigits(n /10);
        }
    }
}
