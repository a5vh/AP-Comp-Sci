/**
 * Created by 19augusthummert on 10/17/2017.
 */
// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;
public class CountingAndLooping
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many times would you like? ");
        int limit = scan.nextInt();
        int count = 1;
        while (count <= limit){
            System.out.println(count + " I love Computer Science!!");
            count++;
                }
        System.out.println("Printed this message " + (count - 1) + " times.");
    }
}


