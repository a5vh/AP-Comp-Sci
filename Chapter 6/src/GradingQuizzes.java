/**
 * Created by 19augusthummert on 1/26/2018.
 */
import java.util.Scanner;
public class GradingQuizzes {

    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many questions are there on the quiz?");
        int questions = scan.nextInt();

        int[] quiz = new int[questions];
        String[] key = new String[questions];
        String[] answers = new String[questions];

        for (int q = 0; q < questions; q++)
        {
            System.out.println("Enter the answer for question " + q);
            String keyAnswer = scan.next();
            key[q] = keyAnswer;
        }


        for (int q=0; q < quiz.length; q++)
        {
            System.out.println("Enter your answer for question " + q);
            String answer = scan.next();
            answers[q] = answer;
        }

        System.out.println("\nAnswers");
        for (int q=0; q < quiz.length; q++)
        {
            if (answers[q].equals(key[q]))
            {
                System.out.println("Question " + q + ": " + "Your answer is correct");
            }
            else System.out.println("Question " + q + ": " + "Your answer is wrong");
        }
    }
}
