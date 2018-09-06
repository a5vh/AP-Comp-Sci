import java.util.Scanner;

public class Book1_5 {

    public static void main(String[] args) //Main entry point to program
    {
        int n1, n2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, I can calculate how many numbers there are between two integers.");
        System.out.println("Please enter two numbers...");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        System.out.println("Your answer is... " + (Math.abs(n1-n2)));
        ///System.out.println(Math.abs(n1-n1) + 1);
    }

}