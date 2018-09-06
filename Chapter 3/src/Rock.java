import com.sun.corba.se.impl.orb.ParserTable;

import java.util.Scanner;
import java.util.Random;


public class Rock
{
    public static void main(String[] args)
    {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine
//computer's play
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
//Get player's play -- note that this is stored as a string
        System.out.println("Enter your play: R, P or S");
        personPlay = scan.nextLine();
//Make player's play uppercase for ease of comparison
        personPlay.toUpperCase();
//Generate computer's play (0,1,2)
        computerInt = generator.nextInt(2);
//Translate computer's randomly generated play to string
        computerPlay = "S";
        switch (computerInt)
        {
            case 0: computerPlay = "S";
                break;
            case 1: computerPlay = "P";
                break;
            case 2: computerPlay = "R";
                break;
        }
//Print computer's play
        System.out.println("Computer's Play: " + computerPlay);
//See who won. Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            if (computerPlay.equals("P"))
                System.out.println("Paper covers rock. You lose.");
        else if (personPlay.equals("P"));
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You win!!");
            if (computerPlay.equals("S"))
                System.out.println("Scissors cut paper. You lose");
        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors cut paper. You win!!");
            if (computerPlay.equals("R"))
                System.out.println("Rock crushes scissors. You lose.");
        else
            System.out.println("Good game.");
            //... Fill in rest of code
    }
}