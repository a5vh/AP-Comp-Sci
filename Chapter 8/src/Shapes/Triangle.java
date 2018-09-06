package Shapes;

/**
 * Created by 19augusthummert on 3/13/2018.
 */
import java.util.Scanner;
//a = (b*h)/2
public class Triangle implements Shape, Measureable {

    public int base = 0;
    public int height = 0;
    public int otherSide = 0;

    public int angle1 = 0;
    public int angle2 = 0;
    public int angle3 = 0;

    public Scanner scan = new Scanner(System.in);

    public double getPerimeter()
    {
        System.out.println("\nWhat is the measure of the base?");
        base = scan.nextInt();
        System.out.println("What is the height?");
        height = scan.nextInt();
        System.out.println("Another side that isn't the hypotenuse?");
        otherSide = scan.nextInt();
        return base+height+otherSide;
    }

    public double getArea()
    {
        return (.5*base*height);
    }

    public int getDiameter()
    {
        return base;
    }

    public int getSides()
    {
        return 3;
    }

    public void printAll()
    {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Sides: " + getSides());
        
    }

}
