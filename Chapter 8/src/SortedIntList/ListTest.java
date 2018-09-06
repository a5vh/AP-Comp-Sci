package SortedIntList; /**
 * Created by 19augusthummert on 2/28/2018.
 */
// ****************************************************************
// SortedIntList.ListTest.java
//
// A simple test program that creates an SortedIntList.IntList, puts some
// ints in it, and prints the list.
//
// ****************************************************************

import java.util.Scanner;

public class ListTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();

        SortedIntList[] myList = new SortedIntList[size];


        for (int i = 0; i < size; i++)
        {
            System.out.println(myList[i]);
        }



    }
}
