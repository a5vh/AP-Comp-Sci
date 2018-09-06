/**
 * input a person's full name
 * take their full name and pull out their last name (space index + 1)
 * ask the person by their last name to enter a, b, c values
 * using the a, b, c value plug them into the quadratic formula w/ Math methods
 */
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        String name, lastName;
        double a, b, c, firstSolution, secondSolution;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name.");
        name = scan.nextLine();
        lastName = name.substring(name.indexOf(" ") + 1);
        System.out.println(lastName + ", please enter three values.");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        firstSolution = ((-b) + (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / (2 * a);
        secondSolution = ((-b) - (Math.sqrt((Math.pow(b, 2) - (4 * a * c))))) / (2 * a);
        System.out.println("The two solutions to those values plugged into the quadratic formula are " + firstSolution + " and " + secondSolution + ".");

    }
}