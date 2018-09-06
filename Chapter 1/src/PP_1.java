/**
 * Created by 19augusthummert on 8/29/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class PP_1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int student1, student2, student3, student4, student5;
        System.out.println("How far did you travel this summer?");
        student1 = scan.nextInt();
        System.out.println("How far did you travel this summer?");
        student2 = scan.nextInt();
        System.out.println("How far did you travel this summer?");
        student3 = scan.nextInt();
        System.out.println("How far did you travel this summer?");
        student4 = scan.nextInt();
        System.out.println("How far did you travel this summer?");
        student5 = scan.nextInt();
        System.out.println("The total distance is: " + (student1 + student2+ student3 + student4 + student5));


    }
}

