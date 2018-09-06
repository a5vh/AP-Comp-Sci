//import creates the link from computer to java api
import java.util.Scanner; //always import scanner

public class MyFirstProgram //CLASS HEADER
{
    public static void main (String [] args) //Main entry point to program
    {
        Scanner scan = new Scanner(System.in); //new scanner item or declaring an object called scanner of the scanner class
        String response; // response is an identifier
        String name; //'empty boxes'

        System.out.print("Hello there! "); //output what you want and keep cursor
        System.out.println("How are you?"); //output and move cursor to next line; methods of out package
        response = scan.nextLine(); //waiting for user to type something in
        System.out.println("What is your name?");
        name = scan.nextLine();

        System.out.println("Nice to meet you "+ name + ", glad to hear you are doing "+ response);
    }
}