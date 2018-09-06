/**
 * Created by 19augusthummert on 9/19/2017.
 */
import java.util.Scanner;

public class Book2_8 {
    public static void main(String[] args) {
        String phrase, newPhrase;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a line of text. No Punctuation Please.");
        phrase = scan.nextLine();
        phrase = phrase.replace("Java", "");
        newPhrase = phrase.concat(" Java");
        System.out.println(newPhrase);
    }
}
