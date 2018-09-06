/**
 * Created by 19augusthummert on 1/31/2018.
 */
import java.util.Scanner;

public class ShopV1 {

    public static void main (String [] args)
    {
        ShoppingCart shop = new ShoppingCart();
        Scanner scan = new Scanner(System.in);

        String itemName = " ";
        String response = " ";

        int quantity = 0;
        double price = 0.0;

        while (response.equalsIgnoreCase("no") == false)
        {
            System.out.println("What is the item name?");
            itemName = scan.next();

            System.out.println("What is the quantity of " + itemName + "?");
            quantity = scan.nextInt();

            System.out.println("What is the price of " + itemName + "?");
            price = scan.nextDouble();

            System.out.println("Do you still want to shop?");
            response = scan.next();

            shop.addToCart(itemName, price, quantity);
        }

        System.out.println("Would you like to sort your list?");
        String sort = scan.next();

        if (sort.equalsIgnoreCase("yes"))
        {
            shop.sort();
        }
        else if (sort.equalsIgnoreCase("no"))
        {

        }

        System.out.println(shop.toString());
    }
}
