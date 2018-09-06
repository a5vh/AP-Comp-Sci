package AthletePartnerProgram;

/**
 * Created by 19augusthummert on 4/4/2018.
 */

import java.util.Arrays;
import java.util.Scanner;
public class Driver {

    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);

        Athlete [] athletes = new Athlete[1];

        for(int i = 0; i < athletes.length; i++)
        {
            System.out.println("Enter the sport of the athlete");
            String sport = scan.next();

            if(sport.equalsIgnoreCase("undecided"))
            {
                System.out.println("Enter the first name of the athlete.");
                String firstName = scan.next();
                System.out.println("Enter the last name of the athlete.");
                String lastName = scan.next();
                System.out.println("Enter the grade of the athlete.");
                int grade = scan.nextInt();

                Athlete athlete = new Athlete(firstName, lastName, grade);

                athletes[i] = athlete;
                sport = " ";
            }

            if(sport.equalsIgnoreCase("baseball"))
            {
                System.out.println("Enter the first name of the baseball player.");
                String firstName = scan.next();
                System.out.println("Enter the last name of the athlete.");
                String lastName = scan.next();
                System.out.println("Enter the greade of the baseball player.");
                int grade = scan.nextInt();
                System.out.println("What arm does " + firstName + " throw with?");
                String throwsWith = scan.next();
                System.out.println("What arm does " + firstName + " bat with.");
                String batsWith = scan.next();
                System.out.println("How many bats has " + firstName + " had?");
                int numBats = scan.nextInt();
                System.out.println("How many hits has ");
                int numHits = scan.nextInt();

                int batAvg = numHits/numBats;

                BaseballPlayer baseBallPlayer = new BaseballPlayer(firstName, lastName, grade, throwsWith, batsWith,
                        numBats, numHits, batAvg);

                athletes[i] = baseBallPlayer;
                sport = " ";
            }

        }


        Arrays.toString(athletes);


    }
}
