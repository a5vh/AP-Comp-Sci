import java.util.ArrayList;
import java.util.Scanner;

public class FoodDriver {

    public static void main (String [] args)
    {
        FoodItem itemFood;
        ArrayList<FoodItem> menu = new ArrayList<>();

        String foodName;
        double foodPrice;
        String foodType;
        int foodQuantity;

        Scanner scan = new Scanner(System.in);
        String response = "yes";

        do
        {
            System.out.println("What is the name of the item?");
            foodName = scan.next();
            System.out.println("What is the price?");
            foodPrice = scan.nextDouble();
            System.out.println("What is the type?");
            foodType = scan.next();
            System.out.println("How much/many?");
            foodQuantity = scan.nextInt();
            itemFood = new FoodItem(foodName, foodPrice, foodType, foodQuantity);
            menu.add(itemFood);
            System.out.println("Do you want to enter more?");
            response = scan.next();
        }
        while (!(response.equalsIgnoreCase("no")));

        System.out.print("\nShopping Cart\n" + "\nItem\t\tUnit Price\tQuantity\tTotal\n");
        System.out.println(menu.toString());

    }
}
