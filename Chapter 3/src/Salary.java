// ***************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ***************************************************************
import java.util.Scanner;
public class Salary
{
    public static void main (String[] args)
    {
        double currentSalary; // current annual salary
        double rating; // performance rating
        double raise; // dollar amount of the raise]
        double newSalary;
        Scanner scan = new Scanner(System.in);
// Get the current salary and performance rating
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating: ");
        rating = scan.nextDouble();
// Compute the raise -- Use if ... else ...
        raise = currentSalary;
        if (rating == 1)
        {
            raise = currentSalary * .06;
        }

        if (rating == 2)
        {
            raise = currentSalary * .04;
        }

        if (rating == 3)
        {
            raise = currentSalary * .015;
        }

// Print the results
        newSalary = currentSalary + raise;
        System.out.println ("Amount of your raise: $" + raise);
        System.out.println ("Your new salary: $" + newSalary);
    }
}