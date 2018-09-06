/**
 * Created by 19augusthummert on 9/11/2017.
 */
import java.util.Scanner;

public class Book2_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double interest, mthinterest, interestpmt, principalpmt, totalinterest;
        int loanAmt, time;

        System.out.println("Enter the amount that you have borrowed...");
        loanAmt = scan.nextInt();
        System.out.println("Enter the amount of time in years you are paying it off for...");
        time = scan.nextInt();

        System.out.println("Enter the percentage of interest...");
        interest = scan.nextDouble();
        interest = interest/100;
        mthinterest = interest/12;
        interestpmt = mthinterest * loanAmt;
        System.out.println("The amount of Interest payment is... " + interestpmt);
        principalpmt = loanAmt/360;
        System.out.println("The amount of Principal payment is... " + principalpmt);
        totalinterest = principalpmt + interestpmt;
        System.out.println("The total monthly payment is... " + totalinterest);
    }
}
