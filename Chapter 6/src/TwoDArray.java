/**
 * Created by 19augusthummert on 2/14/2018.
 */
import java.util.Scanner;

public class TwoDArray {

    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lets make a 2D Array.\nPlease type how many rows you would like.");

        int rows = scan.nextInt();

        System.out.println("Now enter the columns.");

        int columns = scan.nextInt();

        int [][] matrix = new int[rows][columns];

        System.out.println("Now that we have it made, we need to fill it.");


        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.println("Enter the value for row " + row + ", column " + column);
                matrix[row][column] = scan.nextInt();
            }
        }

        System.out.println("\nHere is your 2D Array.");
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++)
            {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
