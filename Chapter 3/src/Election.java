//***************************************************************
// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// **************************************************************
        import java.util.Scanner;
public class Election
{
    public static void main (String[] args)
    {
        int votesForPolly; // number of votes for Polly in each precinct
        int votesForErnest; // number of votes for Ernest in each precinct
        int totalPolly; // running total of votes for Polly
        int totalErnest; // running total of votes for Ernest
        int count;
        int pollyPrecints, ernestPrecints, tie;
        double pollyPercent, ernestPercent;

        String response; // answer (y or n) to the "more precincts" question
        boolean res = false;
        totalPolly = 0;
        totalErnest = 0;
        count = 0;
        pollyPrecints = 0;
        ernestPrecints = 0;
        tie = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println ();
        System.out.println ("Election Day Vote Counting Program");

        // Initializations

        // Loop to "process" the votes in each precinct
        do
        {
            System.out.print("How many votes for Polly: ");
            votesForPolly = scan.nextInt();
            totalPolly += votesForPolly;

            System.out.print("How many votes for Ernest: ");
            votesForErnest = scan.nextInt();
            totalErnest += votesForErnest;

            System.out.println("Any more precints to repeat? Enter Y/N");
            response = scan.next();

            pollyPercent = (votesForPolly/totalPolly) * 100;
            ernestPercent = (votesForErnest/totalErnest) * 100;

            count += 1;

            if (totalPolly > totalErnest) pollyPrecints += 1;
            if (totalErnest > totalPolly) ernestPrecints += 1;
            if (totalErnest == totalPolly) tie += 1;

        } while ((response.equals("y")) || (response.equals("Y")) || (response.equals("yes")));
        // Print out the results



        System.out.println("The total for Polly is: " + totalPolly);
        System.out.println("Polly's percentage is: " + pollyPercent + "%");
        System.out.println("Polly's precints won are: " + pollyPrecints);
        System.out.println("The total for Ernest is: " + totalErnest);
        System.out.println("Ernest's percent is " + ernestPercent + "%");
        System.out.println("Ernest's precints won are: " + ernestPrecints);

    }
}