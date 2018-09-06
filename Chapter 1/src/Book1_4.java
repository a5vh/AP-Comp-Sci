import java.util.Scanner;

public class Book1_4 {

    public static void main(String[] args) //Main entry point to program
    {
        int birthyear, inputn;

        Scanner keyboard = new Scanner(System.in);
        //birthdayyear = keyboard.nextInt();


        System.out.println("Hello, I can calculate what year your birthday will be on and what year it has been on.");
        System.out.println("Please enter your birth year on the next line..");
        birthyear = keyboard.nextInt();
        System.out.println("Please enter what birthday you would like to calculate..");
        inputn = keyboard.nextInt();
        System.out.println(("Your ") + inputn + (" birthday year is.. ") + (birthyear + inputn));







    }
}

