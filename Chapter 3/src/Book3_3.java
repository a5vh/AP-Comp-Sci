/**
 * Created by 19augusthummert on 10/9/2017.
 */
import java.util.Scanner;

public class Book3_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String st1, st2, answer;


     do {
         System.out.println("Enter a string.");
         st1 = scan.nextLine();
         System.out.println("Please enter another string.");
         st2 = scan.nextLine();

         //System.out.println("and another...");
         //st3 = scan.nextLine();


         if (st1.compareTo(st2) > (st2.compareTo(st1))) {
             System.out.println(st2 + " , " + st1);

         }

         if (st2.compareTo(st1) > (st1.compareTo(st2))) {
             System.out.println(st1 + " , " + st2);

         }

         if (st2.compareTo(st1) == (st1.compareTo(st2))) {
             System.out.println("strings are equal");
         }

         System.out.println("Do you have any more strings to compare? YES or NO?");
         answer = scan.next();


     } while (answer.equals("YES") || answer.equals("Yes") || answer.equals("yes"));

    }
}
