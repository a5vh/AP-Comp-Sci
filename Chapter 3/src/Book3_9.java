/**
 * Created by 19augusthummert on 10/23/2017.
 */
import java.util.Scanner;

public class Book3_9 {

    public static void main(String[] args) {
        String firstWord;
        String secondWord;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the word you would like to check");
            firstWord = scan.next();
            secondWord = firstWord.substring(0,1);
            for (int x = (firstWord.length() - 1); (x > 0); x--) {
                secondWord = secondWord.concat(firstWord.substring(x, x+1));
            }
            if (!(firstWord.equalsIgnoreCase("quit"))) {
                if (firstWord.equals(secondWord)) {
                    System.out.println("The word is the same");
                } else {
                    System.out.println("The word is not the same");
                }

            }
        } while (!(firstWord.equalsIgnoreCase("quit")));




    }
}
