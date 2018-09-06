/**
 * Created by 19augusthummert on 11/17/2017.
 */
import java.util.Scanner;
public class BasketBallGame {
    Scanner scan = new Scanner(System.in);
    int points1, points2;
    String name1, name2;
    String status;
    String team;

    public void OnepointScored(String team)
    {
        if (team.equalsIgnoreCase(name1))
        {
            points1 += 1;
        }

        else if (team.equalsIgnoreCase(name2))
        {
            points2 += 1;
        }
    }


    public void TwoPointsScored(String team)
    {
        if (team.equalsIgnoreCase(name1))
        {
            points1 += 2;
        }

        if (team.equalsIgnoreCase(name2))
        {
            points2 += 2;
        }
    }

    public void ThreePointsScored(String team)
    {
        if (team.equalsIgnoreCase(name1))
        {
            points1 += 3;
        }

        if (team.equalsIgnoreCase(name2))
        {
            points2 += 3;
        }
    }


    public String finished()
    {
        return status = "Finished";
    }

    public void getScore1()
    {
        System.out.println(name1 + " Score: " + points1);
    }

    public void getScore2()
    {
        System.out.println(name2 + " Score: " + points2);
    }

    public void getScore()
    {
        System.out.println(name1 + ": " + points1 + ", " + name2 + ": " + points2);
    }

    public void getTeamScore()
    {
        if (points1 > points2)
        {
            System.out.println(name1 + " is Winning");
        }

        if (points2 > points1)
        {
            System.out.println(name2 + " is Winning");
        }
    }

    public void getTeam()
    {
        System.out.println("Enter the name of Team 1.");
        name1 = scan.next();
        System.out.println("Enter the name of Team 2.");
        name2 = scan.next();
    }


}
