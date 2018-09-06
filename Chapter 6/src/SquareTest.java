import java.io.File;

import java.io.IOException;

import java.util.Scanner;


public class SquareTest

{

    public static void main(String[] args) throws IOException

    {

        Scanner scan = new Scanner(new File("C:/Users/August Hummert/Google Drive/School/Junior - 17_18/AP Comp Sci/Chapter 6/src/magicdata"));

        int count = 1; //count which square we're on

        int size = scan.nextInt(); //size of next square


        //Expecting -1 at bottom of input file

        while (size != -1)

        {


            //create a new Square of the given size

            Square magic = new Square(size);

            //call its read method to read the values of the square

            magic.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");

            count++;

            //print the square

            magic.printSquare();

            //print the sums of its rows

            for(int x = 0; x<size; x++) {

                System.out.println(magic.sumRow(x));

            }

            //print the sums of its columns

            for(int x = 0; x<size; x++) {

                System.out.println(magic.sumCol(x));

            }

            //print the sum of the main diagonal

            System.out.println(magic.sumMainDiag());

            //print the sum of the other diagonal

            System.out.println(magic.sumOtherDiag());

            //determine and print whether it is a magic square

            System.out.println(magic.magic());

            //get size of next square

            size = scan.nextInt();

        }

    }

}