//************************************************************************
// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab

// assignment, the lab itself, and the post-lab assignment.
/**
 * 1)
 *   a. outClassAvg = 1 + 1 / 2 + 2 * 100; it adds the pre & post labs
 *      together than adds the preLab max & post lab max
 *   b. inClassAvg = 2 / 2 * 100; it divides the lab points by the lab max and times
 *      them by 100
 *   c. labGrade = OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg; it multiplies the out_weight of
 *      40% by the out of class avg. It then adds the in 
 * 2)
 */
// ***********************************************************************\
import java.util.Scanner;
public class  LabGrades {
    public static void main (String[] args)
    {
// Declare constants
        final double IN_WEIGHT = 0.6; // in-class weight is 60%
        final double OUT_WEIGHT = 0.4; // out-of-class weight is 40%
// Declare variables
        int preLabPts; //number of points earned on the pre-lab assignment
        int preLabMax; //maximum number of points possible for pre-lab
        int labPts; //number of poitns earned on the lab
        int labMax; //maximum number of points possible for lab
        int postLabPts; //number of points earned on the post-lab assignment
        int postLabMax; //maximum number of points possible for the post-lab
        int inClassAvg1;
        double outClassAvg; //average on the out of class (pre and post) work
        double inClassAvg; //average on the in-class work
        double labGrade; //final lab grade
        double outClassAvg1, outClassAvg2;

        Scanner scan = new Scanner(System.in);
// Get the input
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.println();
// Calculate the average for the out of class work
        outClassAvg1 = preLabPts + postLabPts;
        outClassAvg2 = preLabMax + postLabMax;
        outClassAvg = outClassAvg1 / outClassAvg2 * 100;
        // Calculate the average for the in-class work

        inClassAvg = (labPts / labMax) * 100;
// Calculate the weighted average taking 40% of the out-of-class average
// plus 60% of the in-class
        labGrade = OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg;
// Print the results
        System.out.println("Your average on out-of-class work is " + Math.round(outClassAvg) +
                "%");
        System.out.println("Your average on in-class work is " + Math.round(inClassAvg) + "%");

        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println();
    }
}
