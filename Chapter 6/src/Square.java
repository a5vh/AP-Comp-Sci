import java.util.Scanner;

public class Square {

    int[][] square;

    int size;

    //--------------------------------------

    //create new square of given size

    //--------------------------------------

    public Square(int newSize) {

        size = newSize;

        square = new int[size][size];

    }

    //--------------------------------------

    //return the sum of the values in the given row

    //--------------------------------------

    public int sumRow(int row) {

        int sum = 0;

        for(int x=0; x<size; x++) {

            sum = sum + square[row][x];

        }

        return sum;

    }

    //--------------------------------------

    //return the sum of the values in the given column

    //--------------------------------------

    public int sumCol(int col) {

        int sum = 0;

        for(int x=0; x<size; x++) {

            sum = sum + square[x][col];

        }

        return sum;

    }

    //--------------------------------------

    //return the sum of the values in the main diagonal

    //--------------------------------------

    public int sumMainDiag() {

        int sum = 0;

        for(int x=0; x<size; x++) {

            sum = sum + square[x][x];

        }

        return sum;

    }

    //--------------------------------------

    //return the sum of the values in the other ("reverse") diagonal

    //--------------------------------------

    public int sumOtherDiag() {

        int sum = 0;

        for(int x=0; x<size; x++) {

            sum = sum + square[x][size-x-1];

        }

        return sum;

    }

    //--------------------------------------

    //return true if the square is magic (all rows, cols, and diags have

    //same sum), false otherwise

    //--------------------------------------

    public boolean magic() {

        int mustEqual = sumRow(1);

        for(int i=0;i<size;i++){

            if(sumRow(i)==mustEqual){


            } else {

                return false;

            }

        }

        for(int y=0;y<size;y++){

            if(sumCol(y)==mustEqual){


            } else {

                return false;

            }

        }

        if(sumMainDiag()==mustEqual){


        } else {

            return false;

        }

        if(sumOtherDiag()==mustEqual){


        } else {

            return false;

        }

        return true;

    }

    //--------------------------------------

    //read info into the square from the input stream associated with the

    //Scanner parameter

    //--------------------------------------

    public void readSquare(Scanner scan) {

        for (int row = 0; row < square.length; row++)

            for (int col = 0; col < square.length; col++)

                square[row][col] = scan.nextInt();

    }

    //--------------------------------------

    //print the contents of the square, neatly formatted

    //--------------------------------------

    public void printSquare() {

        for(int x = 0; x < size; x++) {

            for(int i = 0; i < size; i++) {

                System.out.print(square[x][i] + " ");

            }

            System.out.println();

        }

    }

}