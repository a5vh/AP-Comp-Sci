/**
 * Created by augusthummert on 11/29/17.
 */
import java.util.Scanner;

public class Book5_5 {

    Scanner scan = new Scanner(System.in);

    private int grade, gradeA, gradeB, gradeC, gradeD, gradeF;
    private boolean active = true;


    /*Will run and take integers.
    A switch is used to ask for each grade number.*/
    public void readGrade(){
    for(int x = 0; x < 5; x++){
    switch(x){
    case 0:
    System.out.println("Input number of \"A's\"");
    gradeA = scan.nextInt();
    break;

    case 1:
    System.out.println("Input number of \"B's\"");
    gradeB = scan.nextInt();
    break;

    case 2:
    System.out.println("Input number of \"C's\"");
    gradeC = scan.nextInt();
    break;

    case 3:
    System.out.println("Input number of \"D's\"");
    gradeD = scan.nextInt();
    break;

    case 4:
    System.out.println("Input number of \"F's\"");
    gradeF = scan.nextInt();
    break;
    }
    }
    }

    /*
    This method will write the output of the scores, and display them
    in a graph.
    */
    public void writeGrade(){
        double gradeSum = gradeA + gradeB + gradeC + gradeD + gradeF;

        double gradeAPerc = ((gradeA / gradeSum) * 100) / 2; int gradeASet = (int) gradeAPerc;
        double gradeBPerc = ((gradeB / gradeSum) * 100) / 2; int gradeBSet = (int) gradeBPerc;
        double gradeCPerc = ((gradeC / gradeSum) * 100) / 2; int gradeCSet = (int) gradeCPerc;
        double gradeDPerc = ((gradeD / gradeSum) * 100) / 2; int gradeDSet = (int) gradeDPerc;
        double gradeFPerc = ((gradeF / gradeSum) * 100) / 2; int gradeFSet = (int) gradeFPerc;

        System.out.println(" 10 20 30 40 50 60 70 80 90 100");
        System.out.println(" | | | | | | | | | |");
        System.out.println("**************************************************");

        for(int x = 0 ; x < gradeASet; x++){
            System.out.print("*");
        }System.out.println(" - A");
        for(int x = 0 ; x < gradeBSet; x++){
            System.out.print("*");
        }System.out.println(" - B");
        for(int x = 0 ; x < gradeCSet; x++){
            System.out.print("*");
        }System.out.println(" - C");
        for(int x = 0 ; x < gradeDSet; x++){
            System.out.print("*");
        }System.out.println(" - D");
        for(int x = 0 ; x < gradeFSet; x++){
            System.out.print("*");
        }System.out.println(" - F");
    }
}

