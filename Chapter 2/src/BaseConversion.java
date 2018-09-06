/**
 * Created by 19augusthummert on 9/11/2017.
 */
import java.util.Scanner;

public class BaseConversion {

    public static void main(String[] args) {
        int base; // the new base
        int base10Num; // the number in base 10
        int maxNumber; // the maximum number that will fit
// in 4 digits in the new base
        int place0; // digit in the 1's (base^0) place
        int place1; // digit in the base^1 place
        int place2; // digit in the base^2 place
        int place3; // digit in the base^3 place
        String baseBNum = new String (""); // the number in the new base
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println();
        System.out.print ("Please enter a base (2 - 9): ");
        base = scan.nextInt();

        System.out.print ("Please enter a base 10 number to convert: ");
        base10Num = scan.nextInt();


        place0 = ((base10Num % base));
        System.out.print(place0);
        place1 = ((place0 % base));
        System.out.print(place1);
        place2 = ((place1 % base));
        System.out.print(place2);
        place3 = ((place2 % base));
        System.out.print(place3);


// Then compute the new quotient
// Repeat the idea from above to compute place2 and the next quotient
// Repeat again to compute place3

// Print the result (see notes in lab)

    }
}
