/**
 * Created by 19augusthummert on 1/12/2018.
 */
import java.util.Scanner;
public class RationalNumTest {

    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numerator.");
        int numerator = scan.nextInt();
        System.out.println("Enter the denominator");
        int denominator = scan.nextInt();

        RationalNum num = new RationalNum(numerator, denominator);

        System.out.println(num.getValue());
        System.out.println(num.toString());

    }
}
