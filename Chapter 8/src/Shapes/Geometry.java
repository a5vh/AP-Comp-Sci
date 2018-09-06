package Shapes;

/**
 * Created by 19augusthummert on 3/13/2018.
    area for circle/tri/square, perimeter for circle/tri/square, diameter for circle
 */
import java.awt.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Geometry {

    public static void main(String [] args)
    {
        boolean quit = false;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("\nWhich shape?");
            System.out.println("\nSHAPES");
            System.out.println("======");
            System.out.println("0: Quit");
            System.out.println("1: Square");
            System.out.println("2: Circle");
            System.out.println("3: Triangle");
            System.out.println("4: Rectangle");

            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    quit = true;
                    if (quit)
                        System.exit(0);
                    break;
                case 1:
                    Square square = new Square();
                    square.printAll();
                    break;
                case 2:
                    Circle circle = new Circle();
                    circle.printAll();
                    break;
                case 3:
                    Triangle triangle = new Triangle();
                    triangle.printAll();
                    break;
                case 4:
                    Rectangle rect = new Rectangle();
                    rect.printAll();
            }

        } while (quit == false);



    }
}
