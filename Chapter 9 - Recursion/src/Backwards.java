/**
 * Created by 19augusthummert on 4/5/2018.
 */
// ******************************************************************
// Backwards.java
//
// Uses a recursive method to print a string backwards.
////take the last letter - 1 add to another string then kills the letter
//return all the letters except the last one then do it again
// ******************************************************************
import java.util.Scanner;
public class Backwards
{
    public static String reverse = "";
    //--------------------------------------------------------------
// Reads a string from the user and prints it backwards.
//--------------------------------------------------------------
    public static void main(String[] args)
    {
        String msg;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        msg = scan.nextLine();
        System.out.print("\nThe string backwards: ");
        System.out.println(printBackwards(msg));
        System.out.println();
    }
    //--------------------------------------------------------------
// Takes a string and recursively prints it backwards
//--------------------------------------------------------------
    public static String printBackwards(String s)
    {
        if(s.length() <= 1)
        {
            reverse += s.substring(0,1);
            return reverse;
        }
        else
        {
            reverse += s.substring(s.length() - 1, s.length());
            return printBackwards(s.substring(0, s.length() - 1));
        }
    }
}
