/**
 * Created by 19augusthummert on 9/25/2017.
 */
import java.util.Scanner;

public class CelciusToFahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double degreesC;
        int degreesF;

        System.out.println("Enter the degrees in Fahrenheit as a whole number.");
        degreesF = scan.nextInt();
        degreesC = 5 * (degreesF - 32)/9;
        System.out.println(degreesF + " degrees Fahrenheit is " + degreesC + " degrees Celcius.");
    }
}
