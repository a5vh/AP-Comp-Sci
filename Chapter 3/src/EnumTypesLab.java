/**
 * Created by 19augusthummert on 10/10/2017.
 */
import java.text.NumberFormat;
import java.util.Scanner;

public class EnumTypesLab {

    enum Averages {U, P, A, E, M}


    public static void main(String[] args) {
        Averages batR;
        Scanner scan = new Scanner(System.in);
        batR = Averages.A;
        String batW;
        String name;
        double batA, hits, atBats;

        System.out.println("Enter your player's name.");
        name = scan.nextLine();
        System.out.println("Enter " + name + "'s number of hits.");
        hits = scan.nextDouble();
        System.out.println("Enter " + name + "'s number of at bats.");
        atBats = scan.nextDouble();

        batA = hits / atBats;
        batW = " ";

        if (batA < .200) batR = Averages.U;
        if ((batA > .200) && (batA < .230)) batR = Averages.P;
        if ((batA > .230) && (batA < .299)) batR = Averages.A;
        if ((batA > .300) && (batA < .400)) batR = Averages.E;
        if (batA > .400) batR = Averages.M;


        switch (batR)
        {
            case U:
                batW = "UNACCEPTABLE";
            break;

            case P:
                batW = "POOR";
            break;

            case A:
                batW = "AVERAGE";
            break;

            case E:
                batW = "EXCELLENT";
            break;

            case M:
                batW = "MVP";
            break;

        }

        System.out.println(batW);


    }
}
