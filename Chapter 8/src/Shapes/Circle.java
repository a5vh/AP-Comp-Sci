package Shapes;

/**
 * Created by 19augusthummert on 3/13/2018.
 */
import java.util.Scanner;
public class Circle implements Shape, Measureable {

    static Scanner scan = new Scanner(System.in);
    public int diameter = 0;
    public double radius = 0;

    public int getSides()
    {
        return 0;
    }

    public double getPerimeter()
    {
        System.out.println("\nWhat is the diameter of the circle?");
        diameter = scan.nextInt();
        radius = diameter/2;
        return (2 * Math.PI * radius);
    }

    public double getArea()
    {
        return (Math.PI * Math.pow(radius, 2));
    }

    public int getDiameter()
    {
        return diameter;
    }

    public void printAll()
    {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Sides: " + getSides());
    }
}
