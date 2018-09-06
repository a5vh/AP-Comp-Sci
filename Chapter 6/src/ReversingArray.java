/**
 * Created by 19augusthummert on 2/9/2018.
 */
import java.util.Scanner;
public class ReversingArray {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = 0;

        System.out.println("How long sdo you want the array to be?");
        size = scan.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Enter the value at " + i);
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);

        }

        for (int i = 0; i < ((double)size/2); i++)
        {
            int frontIndex = i;
            int backIndex = (array.length-1) - i;
            int frontVal = array[frontIndex];
            int backVal = array[backIndex];
            array[frontIndex] = backVal;
            array[backIndex] = frontVal;
        }

        System.out.println("The reversed array..");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}

