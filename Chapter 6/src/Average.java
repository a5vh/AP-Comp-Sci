/**
 * Created by 19augusthummert on 2/2/2018.
 */
public class Average {

    public static void main (String [] args)
    {
        int a = args.length;
        int sum = 0;

        System.out.println("You entered " + a + " words.");

        for (int i = 0; i < args.length; i++)
        {
            System.out.println("Number " + i + ": " + args[i]);
            a = Integer.parseInt(args[i]);
            int currentNum = Integer.parseInt(args[i]);
            sum += currentNum;
        }

        System.out.println("\nAverage: " + (sum/a));
    }
}
