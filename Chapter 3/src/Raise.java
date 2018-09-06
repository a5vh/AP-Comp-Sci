// ***************************************************************
// Salary.java
//
// Computes the amount of a raise and the new
// salary for an employee. The current salary
// and a performance rating (a String: "Excellent",
// "Good" or "Poor") are input.
// ***************************************************************
import java.util.Scanner;
import java.text.NumberFormat;
public class Raise
{
    public static void main (String[] args)
    {
        double currentSalary; // employee's current salary
        double raise; // amount of the raise
        double newSalary; // new salary for the employee

        String rating; // performance rating
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");
        rating = scan.next();
        raise = 1.0;

        // Compute the raise using if ...
        if ((rating.equals("excellent")) || (rating.equals("Excellent")))
        {
            raise = currentSalary * .06;
        }

        if ((rating.equals("Good")) || (rating.equals("good")))
        {
            raise = currentSalary * .04;
        }

        if ((rating.equals("Poor")) || (rating.equals("poor")))
        {
            raise = currentSalary * .015;
        }

        newSalary = currentSalary + raise;
// Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your raise: " + money.format(raise));
        System.out.println("Your new salary: " + money.format(newSalary));
        System.out.println();
    }
}