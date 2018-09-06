package ComparePlayer; /**
 * Created by 19augusthummert on 2/27/2018.
 */
// **********************************************************
// ComparePlayer.Player.java
//
// Defines a ComparePlayer.Player class that holds information about an athlete.
// **********************************************************
import java.util.Scanner;
public class Player
{
    private String name;
    private String team;
    private int jerseyNumber;
    //-----------------------------------------------------------
// Prompts for and reads in the player's name, team, and
// jersey number.
//-----------------------------------------------------------
    public void readPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void printPlayer()
    {
        System.out.println(name);
        System.out.println(team);
        System.out.println(jerseyNumber);
    }

    public boolean equals(Player object)
    {
        boolean nambool = false;
        boolean teabool = false;
        boolean jerbool = false;

        String name1 = this.name;
        name1.trim();
        String name2 = object.getName();
        name2.trim();

        String team1 = this.team;
        team1.trim();
        String team2 = object.getTeam();
        team2.trim();

        int jersey1 = this.jerseyNumber;
        int jersey2 = object.getJerseyNumber();

        if (name1.equalsIgnoreCase(name2)) nambool = true;
        else nambool = false;

        if (team1.equalsIgnoreCase(team2)) teabool = true;
        else teabool = false;

        if (jersey1 == jersey2) jerbool = true;
        else jerbool = false;

        if (nambool && teabool && jerbool) return true;
        else return false;


    }
}