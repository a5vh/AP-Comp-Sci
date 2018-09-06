package ComparePlayer; /**
 * Created by 19augusthummert on 2/27/2018.
 */
// **************************************************************
// ComparePlayer.ComparePlayers
//
// Reads in two ComparePlayer.Player objects and tells whether they represent
// the same player.
// **************************************************************
import java.util.Scanner;
public class ComparePlayers
{
    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Scanner scan = new Scanner(System.in);
//Prompt for and read in information for player 1
        System.out.println("Enter the Information that follows.");
        player1.readPlayer();
//Prompt for and read in information for player 2
        System.out.println("Enter the Information that follows.");
        player2.readPlayer();
//Compare player1 to player 2 and print a message saying
        if (player1.equals(player2))
        {
            System.out.println("The players are the same.");
        }
        else System.out.println("The players are not equal.");
//whether they are equal


    }
}