/**
 * Created by 19augusthummert on 10/5/2017.
 */
import java.util.Scanner;

public class Charge {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double interest, interestPercent;
        double previousBalance, additionalCharges, minimumPayment, newBalance;
        interest = 0.0;

        System.out.println("Enter your previous balance");
        previousBalance = scan.nextDouble();
        System.out.println("Enter your monthly additional charges.");
        additionalCharges = scan.nextDouble();

        if (previousBalance == 0) interestPercent = 0.0;
        if (previousBalance > 0) interestPercent = 0.02;

        newBalance = (previousBalance + additionalCharges + interest);
        minimumPayment = 0;

        if (newBalance < 50) minimumPayment = newBalance;
        if ((newBalance > 50) && (newBalance < 300)) newBalance = 50;
        if (newBalance > 300) newBalance = .2 * newBalance;

        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println("Previous Balance:       $" + previousBalance);
        System.out.println("Additional Charges:     $" + additionalCharges);
        System.out.println("Interest:               $" + interest);
        System.out.println("                               ");
        System.out.println("New Balance:            $" + newBalance);
        System.out.println("                               ");
        System.out.println("Minimum Payment:        $" + minimumPayment);

    }
}
