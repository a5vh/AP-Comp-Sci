package TestQuestions; /**
 * Created by 19augusthummert on 3/2/2018.
    TestQuestions.Essay is the type of test question and so is mult choice while write test is the PubStatVoidMain type of class
    Character which reads which type of question it is is read by the driver. ToString methods for both mult and essay
    return formatted versions of the questions

    TEESTQ
    /   \
 TestQuestions.Essay  Mult

 */
import java.io.File;
import java.util.Scanner;
public abstract class TestQuestion {

    Scanner scan = new Scanner("C:/Users/19augusthummert/Google Drive/Junior - 17_18/AP Comp Sci/Chapter 8/src/testbank.dat");
    protected String question;

    public abstract void readQuestion(Scanner scan);
    public abstract String toString();

}
