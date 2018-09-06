// ****************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess; //The user's guess
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
//randomly generate the number to guess
        numToGuess = generator.nextInt(10);

//print message asking user to enter a guess
        System.out.print("Guess a number between 1 and 10: ");
//read in guess
        guess = scan.nextInt();

        do//keep going as long as the guess is wrong
        {
//print message saying guess is wrong
            System.out.println("Guess is wrong. Try again: ");
//get another guess from the user
            guess = scan.nextInt();
            if (guess == numToGuess) System.out.println("Guess is right! Good job.");
        } while (numToGuess != guess);
//print message saying guess is right

    }
}