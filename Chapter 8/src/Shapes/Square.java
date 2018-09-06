package Shapes;

/**
 * Created by 19augusthummert on 3/13/2018.
 */
import java.util.Scanner;

public class Square implements Shape, Measureable{

    static Scanner scan = new Scanner(System.in);
    public int side1 = 0;

    public int getSides()
    {
        return 4;
    }

    public double getPerimeter()
    {
        System.out.println("\nWhat is the length of the only side?");
        side1 = scan.nextInt();
        return side1*4;
    }

    public double getArea()
    {
        return side1*side1;
    }

    public int getDiameter()
    {
        return side1;
    }

    public void printAll()
    {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("Diameter: " + getDiameter());
        System.out.println("Sides: " + getSides());

    }


}
