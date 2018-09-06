/**
 * Created by 19augusthummert on 10/23/2017.
 */
import java.util.Scanner;

public class Book3_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score, numofA, numofB, numofC, numofD, numofF, count;
        numofA = 0;
        numofB = 0;
        numofC = 0;
        numofD = 0;
        numofF = 0;
        count = 0;

        System.out.println("Please type the scores...");

        do {
            score = scan.nextInt();

            if ((score <= 100) && (score >= 90)) numofA += 1;

            if ((score <= 89) && (score >= 80)) numofB += 1;

            if ((score <= 79) && (score >= 70)) numofC += 1;

            if ((score <= 69) && (score >= 60)) numofD += 1;

            if ((score <= 59) && (score >= 0)) numofF += 1;

            if (score > 100) System.out.println("Score is not between 0 and 100");

            count++;

        } while (score != -1);

        System.out.println("Total number of Grades = " + (count-1));
        System.out.println("Number of A's = " + numofA);
        System.out.println("Number of B's = " + numofB);
        System.out.println("Number of C's = " + numofC);
        System.out.println("Number of D's = " + numofD);
        System.out.println("Number of F's = " + numofF);

    }
}
