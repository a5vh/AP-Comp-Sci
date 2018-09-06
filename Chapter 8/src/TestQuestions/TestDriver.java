package TestQuestions; /**
 * Created by 19augusthummert on 3/5/2018.
 */
//reading the file and then outputting from that file

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class TestDriver {

    public static void main (String[] args) throws FileNotFoundException
    {
        File file = new File("C:/Users/19augusthummert/Google Drive/Junior - 17_18/AP Comp Sci/Chapter 8/testbank.dat");
        Scanner scan = new Scanner(file);

        int numofquestions = scan.nextInt();
        TestQuestion Questions[] = new TestQuestion[numofquestions];

        for (int i = 0; i < Questions.length; i++)
        {
            String typeofQ = scan.next();
            if (typeofQ.equalsIgnoreCase("e"))
            {
                Essay essay = new Essay();
                Questions[i] = essay;
                essay.readQuestion(scan);
            }

            if (typeofQ.equalsIgnoreCase("m"))
            {
                MultChoice mult = new MultChoice();
                Questions[i] = mult;
                mult.readQuestion(scan);
            }
        }


    }


}
