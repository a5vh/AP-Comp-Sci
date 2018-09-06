import java.util.Scanner;
public class TicTacToe {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] tictac;
        int[][] score;
        int spot1, spot2;
        int rows = 3;
        int cols = 3;

        tictac = new String[3][3];
        score = new int[3][3];

        boolean j = true;
        int i = 0;

        for (int a = 0; a < rows; a++) {
            for (int z = 0; z < cols; z++) {
                tictac[a][z] = "|";
                score[a][z] = 10;
            }
        }

        while (j) {
            System.out.println("X's: row, col");
            spot1 = scan.nextInt();
            spot2 = scan.nextInt();

            tictac[spot1][spot2] = "X";
            score[spot1][spot2] = 1;

            System.out.println("Your turn.");
            System.out.println("O's: row, col");

            spot1 = scan.nextInt();
            spot2 = scan.nextInt();

            tictac[spot1][spot2] = "O";
            score[spot1][spot2] = 2;

            for (int a = 0; a < rows; a++) {
                for (int z = 0; z < cols; z++) {
                    System.out.print(tictac[a][z] + "\t");
                }
                System.out.println();
            }

            i++;

            if (i < 3) {
                if ((score[0][0] + score[0][1] + score[0][2] == 3) || (score[1][0] + score[1][1] + score[1][2] == 3) || (score[2][0] + score[2][1] + score[2][2] == 3)) {
                    j = false;
                    System.out.println("X's Win");
                } else if ((score[0][0] + score[0][1] + score[0][2] == 6) || (score[1][0] + score[1][1] + score[1][2] == 6) || (score[2][0] + score[2][1] + score[2][2] == 6)) {
                    j = false;
                    System.out.println("O's Win");
                } else if ((score[0][0] + score[0][1] + score[0][2] == 3) || (score[1][0] + score[1][1] + score[1][2] == 3) || (score[2][0] + score[2][1] + score[2][2] == 3)) {
                    j = false;
                    System.out.println("X's Win");
                } else if ((score[0][0] + score[0][1] + score[0][2] == 6) || (score[1][0] + score[1][1] + score[1][2] == 6) || (score[2][0] + score[2][1] + score[2][2] == 6)) {
                    j = false;
                    System.out.println("O's Win");
                } else if (1 == 4) {
                    j = false;
                    System.out.println("Cat's Game");
                }
            }
        }
        for (int b = 0; b < rows; b++) {
            for (int y = 0; y < cols; y++) {
                System.out.print(tictac[b][y] + "");
            }

            System.out.println();
        }
    }
}


