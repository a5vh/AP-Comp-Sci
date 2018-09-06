/**
 * Created by 19augusthummert on 8/29/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class PP_2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int st1, st2, st3, st4, st5;
        System.out.println("How many hours have you played Pokemon GO?");
        st1 = scan.nextInt();
        System.out.println("How many hours have you played Pokemon GO?");
        st2 = scan.nextInt();
        System.out.println("How many hours have you played Pokemon GO?");
        st3 = scan.nextInt();
        System.out.println("How many hours have you played Pokemon GO?");
        st4 = scan.nextInt();
        System.out.println("How many hours have you played Pokemon GO?");
        st5 = scan.nextInt();
        System.out.println("You guys have burned a total of " + (st1*30 + st2*30 + st3*30 + st4*30 + st5*30) + " calories");
        }
    }


