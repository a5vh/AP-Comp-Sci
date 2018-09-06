package Shapes;

/**
 * Created by 19augusthummert on 3/15/2018.
 */
import java.util.Scanner;

public class Rectangle implements Shape, Measureable {

    public int longSide = 0;
    public int shortSide = 0;

    public Scanner scan = new Scanner(System.in);

    public double getPerimeter()
    {
        System.out.println("\nWhat is the measure of the longer side?");
        longSide = scan.nextInt();
        System.out.println("What is the measure of the shorter side?");
        shortSide = scan.nextInt();

        return ((longSide*2) + (shortSide*2));
    }

    public double getArea()
    {
        return longSide * shortSide;
    }

    public int getDiameter()
    {
        return longSide;
    }

    public int getSides()
    {
        return 4;
    }

    public void printAll()
    {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Sides: "+ getSides());

    }

}
