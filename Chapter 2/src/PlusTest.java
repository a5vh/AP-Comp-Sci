/**
 * Created by 19augusthummert on 9/15/2017.
 * The first line was printed because the plus sign means to concatenation of two strings
 * The second line was printed because the plus sign means to concate the 55 and "Years ago" into one big string
 * The third line was printed because both plus signs mean concatenation
 * The fourth line was printed because the first plus sign means concatenation and the second means addition
 * The fifth line was printed because the first sign means addition and the second one menas concatenation
 * The line could be fixed by putting a space in the first quotation
 */

public class PlusTest {
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
        System.out.println ("This is a long string that is the " +
                "concatenation of two shorter strings.");
        System.out.println ("The first computer was invented about " + 55 +

                "years ago.");

        System.out.println ("8 plus 5 is " + 8 + 5);
        System.out.println ("8 plus 5 is " + (8 + 5));
        System.out.println (8 + 5 + " equals 8 plus 5.");
    }
}
