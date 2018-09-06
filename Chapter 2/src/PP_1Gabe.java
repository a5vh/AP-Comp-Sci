/**
 * Created by 19augusthummert on 9/25/2017.
 */
import java.util.Scanner;

public class PP_1Gabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phrase, newPhrase, firstHalf, secondHalf;
        int characters, mod;

        System.out.println("Enter a phrase. Three words only.");
        phrase = scan.nextLine();
        mod = phrase.length()%2;

        newPhrase = phrase.toUpperCase();
        newPhrase = newPhrase.replaceAll(" ", "");
        firstHalf = newPhrase.substring(0, newPhrase.length() / 2 + mod);
        secondHalf = newPhrase.substring(newPhrase.length() / 2 + mod, newPhrase.length());


        characters = newPhrase.length();

        System.out.println("Now there are " + characters + " characters.");
        System.out.println("Original phrase is: " + phrase);
        System.out.println("New Phrase is: " + newPhrase);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

}