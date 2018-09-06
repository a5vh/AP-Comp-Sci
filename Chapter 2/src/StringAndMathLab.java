/**
 * Created by 19augusthummert on 9/21/2017.
 */
import java.util.Scanner;
import java.util.Random;

public class StringAndMathLab {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName, middleName, lastName, fullName;
        String username = "";
        int spaceIndex1, spaceIndex2, randNum;

        System.out.println("Enter your first, middle and last name.");

        fullName = scan.nextLine();
        spaceIndex1 = fullName.indexOf(" ");
        firstName = fullName.substring(0, spaceIndex1);
        firstName = firstName.trim();
        spaceIndex2 = fullName.lastIndexOf(" ");
        middleName = fullName.substring(spaceIndex1, spaceIndex2);
        middleName = middleName.trim();
        lastName = fullName.substring(spaceIndex2);
        lastName = lastName.trim();

        username = username.concat(firstName.substring(0,1) +
                middleName.substring(0,1) + lastName.substring(0,3));
        randNum = (int)(89999 * Math.random()) + 1;

        System.out.println("\n" + firstName + " " + middleName + " " + lastName);
        System.out.println("Your username is " + username.toUpperCase());





    }
}
