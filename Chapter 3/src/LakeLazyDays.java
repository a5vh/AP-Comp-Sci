/**
 * Created by 19augusthummert on 10/3/2017.
 */
import java.util.Scanner;

public class LakeLazyDays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int temp;

        System.out.println("Enter the temperature of Lake LazyDays.");
        temp = scan.nextInt();

        if (temp >= 80)
        {

            System.out.print("The activity of the day is Swimming");
        }


        if ((60 <= temp) && (temp < 80))
        {
            System.out.print("The activity of the day is Tennis");
        }

        if ((40 <= temp) && (temp < 60))
        {
            System.out.print("The activity of the day is Golf");
        }


        if (temp < 40)
        {
            System.out.print("The activity of the day is Skiing");
        }
    }
}
