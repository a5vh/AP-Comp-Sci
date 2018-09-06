/**
 * Created by 19augusthummert on 11/6/2017.
 */
import java.util.Scanner;

public class TestNames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName;


        //ASK USER FOR INPUT
        System.out.print("Enter your first name: ");
        firstName = scan.next();
        System.out.print("Enter your middle name: ");
        middleName = scan.next();
        System.out.print("Enter your last name: ");
        lastName = scan.next();

        Name name1 = new Name(firstName, middleName, lastName);
        System.out.println(" ");
        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());


        System.out.print("Enter your first name: ");
        firstName = scan.next();
        System.out.print("Enter your middle name: ");
        middleName = scan.next();
        System.out.print("Enter your last name: ");
        lastName = scan.next();

        Name name2 = new Name(firstName, middleName, lastName);
        System.out.println(" ");
        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());

        if (name1.equals(name2))
        {
            System.out.println("True");
        } else System.out.println("False");




    }
}
