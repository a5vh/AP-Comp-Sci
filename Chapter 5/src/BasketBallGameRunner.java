/**
 * Created by 19augusthummert on 11/20/2017.
 */
import java.util.Scanner;

public class BasketBallGameRunner {

    public static void main(String[] args) {
        int time, score;
        String name1, name2, team;
        Scanner scan = new Scanner(System.in);
        time = 0;


        BasketBallGame game = new BasketBallGame();
        game.getTeam();
        name1 = game.name1;
        name2 = game.name2;

        team = game.team;

        while (game.status != "Finished") {
            System.out.println("Enter a score.");
            team = scan.next();
            score = scan.nextInt();
            if (team.equalsIgnoreCase(name1)) ;
            {
                System.out.println(name2);
                if (score == 1) {
                    game.OnepointScored(name1);
                }
                if (score == 2) {
                    game.TwoPointsScored(name1);
                }
                if (score == 3) {
                    game.ThreePointsScored(name1);
                }
                game.getScore();
            }

            if (team.equalsIgnoreCase(name2)) {
                if (score == 1) {
                    game.OnepointScored(name2);
                }
                if (score == 2) {
                    game.TwoPointsScored(name2);
                }
                if (score == 3) {
                    game.ThreePointsScored(name2);
                }
                game.getScore();

            }
        time++;
        }
    }
}
