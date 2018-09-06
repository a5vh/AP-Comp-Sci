/**
 * Created by 19augusthummert on 10/2/2017.
 */
/*
1 Read in 3 ints from the user
2 Sort them from highest to lowest

 */
import java.util.Scanner;

public class OrderOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int int1, int2, int3;

        System.out.println("Enter 3 Integers on the line below.");

        int1 = scan.nextInt();
        int2 = scan.nextInt();
        int3 = scan.nextInt();

        if ((int1 > int2) && (int1 > int3) && (int2 > int3)) ;
        {
            System.out.print(int1 + " , " + int2 + " , " + int3);
        }

        if ((int1 > int2) && (int1 > int3) && (int3 > int2)) ;
        {
            System.out.print(int1 + " , " + int3 + " , " + int2);
        }



        if ((int2 > int3) && (int2 > int1) && (int1 > int3)) ;
        {
            System.out.print(int2 + " , " + int1 + " , " + int3);
        }

        if ((int2 > int3) && (int2 > int1) && (int3 > int1)) ;
        {
            System.out.print(int2 + " , " + int1 + " , " + int3);
        }



        if ((int3 > int1) && (int3 > int2) && (int1 > int2)) ;

        {
            System.out.print(int3 + " , " + int1 + " , " + int2);
        }

        if ((int3 > int1) && (int3 > int2) && (int2 > int1)) ;
        {
            System.out.print(int3 + " , " + int1 + " , " + int2);
        }
    }

}
