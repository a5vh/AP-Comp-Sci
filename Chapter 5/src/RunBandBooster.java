/**
 * Created by 19augusthummert on 11/14/2017.
 */
import java.util.Scanner;

public class RunBandBooster {


    public static void main(String[] args) {
        String name1, name2;
        int count, boxesSold;
        Scanner scan = new Scanner(System.in);
        name1 = " ";
        name2 = " ";
        count = 1;
        boxesSold = 0;

        System.out.println("Enter the name of Band Booster 1.");
        name1 = scan.next();
        System.out.println("Enter the name of Band Booster 2.");
        name2 = scan.next();


        BandBooster booster1 = new BandBooster(name1);
        BandBooster booster2 = new BandBooster(name2);



        while (count <= 3)
        {
            System.out.println("Enter the number of boxes sold by " + name1 + " in week " + count);
            boxesSold = scan.nextInt();
            booster1.updateSales(boxesSold);

            System.out.println("Enter the number of boxes sold by " + name2 + " in week " + count);
            boxesSold = scan.nextInt();
            booster2.updateSales(boxesSold);

            count++;
        }

        System.out.println(booster1.toString());
        System.out.println(booster2.toString());
    }
}
