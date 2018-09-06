/**
 * Created by 19augusthummert on 9/6/2017.
 */
import java.util.Scanner;
public class Ideal_Weight {

    public static void main(String[] args){

        /** ideal weight for female is 100 lbs + 5 lbs for each inch over 5 ft
         *  5'5" would be 100 + 15 = 115
         *  ideal weight for male is 106 + 6 lbs for each inch over 5 ft
         *  6'2" would be 106 + 14*6 = 190
         */
        Scanner scan = new Scanner(System.in);
        int feet, inches, totalinches,idealfemalewt, idealmalewt, idealmalemod, idealfemalemod;
        boolean morf = false;


        System.out.println("Please enter how tall you are in feet and inches...");
        feet = scan.nextInt();
        inches = scan.nextInt();
        totalinches = (feet*12) + inches - 60;



        idealmalewt = totalinches * 6 + 106;
        idealfemalewt = totalinches * 5 +100;
        System.out.println("The ideal weight for a female with the height of " + feet + " feet " + inches + " inches " + " is " + idealfemalewt);
        System.out.println("The ideal weight for a male with the height of " + feet + " feet " + inches + " inches " + "is " + idealmalewt);













    }
}
