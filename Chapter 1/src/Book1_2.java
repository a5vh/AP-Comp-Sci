import java.util.Scanner;

public class Book1_2 {

    public static void main (String [] args) //Main entry point to program
    {
        System.out.println("Hello out there.");
        System.out.println("I will add three numbers for you.");
        System.out.println("Enter three whole numbers on a line:");

        int n1, n2, n3;


        Scanner keyboard = new Scanner(System.in);
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();


        System.out.println("The sum of those three numbers is");
        System.out.println(n1 + n2 + n3);

    }
}
