import java.util.Scanner;

/**
 * Created by 19augusthummert on 12/8/2017.
 */
public class PlayerR {

    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        String name1, name2;
        int positionX1, positionY1, positionX2, positionY2, offsetX1, offsetY1, offsetX2, offsetY2;

        name1 = " ";
        name2 = " ";

        System.out.println("Enter Player 1's name.");
        name1 = scan.next();
        System.out.println("Enter " + name1 + "'s X coordinate and y coordinate. (X  Y)");
        positionX1 = scan.nextInt();
        positionY1 = scan.nextInt();

        System.out.println("Enter Player 2's name.");
        name2 = scan.next();
        System.out.println("Enter " + name2 + "'s X coordinate and y coordinate. (X  Y");
        positionX2 = scan.nextInt();
        positionY2 = scan.nextInt();

        Player player1 = new Player(name1, positionX1, positionY1);
        Player player2 = new Player(name2, positionX2, positionY2);

        System.out.println("Enter " + name1 + "'s horizontal move offset");
        offsetX1 = scan.nextInt();
        player1.moveX(offsetX1);

        System.out.println("Enter " + name1 + "'s vertical move offset");
        offsetY1 = scan.nextInt();
        player1.moveY(offsetY1);

        System.out.println("Enter " + name1 + "'s diagonal move angle degrees.");


        System.out.println("Enter " + name2 + "'s horizontal move offset");
        offsetX2 = scan.nextInt();
        player2.moveX(offsetX2);

        System.out.println("Enter " + name2 + "'s vertical move offset");
        offsetY2 = scan.nextInt();
        player2.moveY(offsetY2);

        System.out.println("Enter " + name2 + "'s diagonal move angle degrees.");

        System.out.println(name1 + "'s position: " + player1.getPositionX() + "," + player1.getPositionY());
        System.out.println(name2 + "'s position: " + player2.getPositionX() + "," + player2.getPositionX());

        System.out.println("Distance between players: " + player1.distanceFrom(player2));


    }
}
