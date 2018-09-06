/**
 * Created by 19augusthummert on 10/23/2017.
 */
import java.util.Scanner;

public class Book3_11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int price, quarters, dimes, nickels, tempChange;

        System.out.println("Enter the price of the item.");
        System.out.print("(from 25 cents to a dollar, in 5 cent increments): ");
        price = scan.nextInt();
        quarters = 0;
        dimes = 0;
        nickels = 0;
        tempChange = 0;


        if ((price > 25) && (price < 100) && (price % 5 == 0))
        {

            System.out.println("You bought an item for " + price + " cents and gave me a dollar,");
            System.out.println("so your change is: ");
            tempChange = 100 - price;
            quarters = tempChange / 25;
            tempChange = (100 - price) - (quarters * 25);
            dimes = tempChange / 10;
            tempChange = (100 - price) - (quarters * 25) - (dimes * 10);
            nickels = tempChange / 5;

            System.out.println(quarters + " quarters");
            System.out.println(dimes + " dimes");
            System.out.println(nickels + " nickel");


        }

        if (price < 25)  System.out.println("Price is below 25 and change cannot be calculated.");

        if (price > 100) System.out.println("Price is above 100 and change cannot be calculated");

        if (price % 5 != 0) System.out.println("Price isn't a multiple of 5");



    }
}
