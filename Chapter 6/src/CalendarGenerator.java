/**
 * Created by 19augusthummert on 2/15/2018.
 */
import java.util.Scanner;

public class CalendarGenerator {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int size;
        Month ml;

        String month, day;
        System.out.println("What month would you like to print?");
        month = scan.next();
        System.out.println("What day does the month start on?");
        day = scan.next();
        ml = new Month(month, day);
        System.out.println("How many special days?");
        size = scan.nextInt();
        ml.fillCalendar(size);
        ml.printCalendar();
    }
}
