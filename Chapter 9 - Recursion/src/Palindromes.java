/**
 * Created by 19augusthummert on 4/5/2018.
 */
import java.util.Scanner;
public class Palindromes
{
    public static void main(String [] args)
    {

        String s;
        String a = "";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");

        s = scan.nextLine();

        if(palindrome(s))
        {
            System.out.println("This is a palindrome");
        }
        else
        {
            System.out.println("This is not a palindrome");
        }

    }

    public static boolean palindrome(String s)
    {
        boolean a = true;
        String n = s.substring(0,1);
        String n2 = s.substring(s.length()-1,s.length());
        if(n.compareTo(n2) == 0)
        {
            if(s.length() == 1)
            {
                a = true;

            }
            else
            {

                palindrome(s.substring(s.length()-1,s.length()));
            }
        }
        else
        {
            a = false;
        }
        return a;
    }
}
