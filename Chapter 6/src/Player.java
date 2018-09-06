/**
 * Created by 19augusthummert on 12/7/2017.
 */
import java.util.Scanner;

public class Player {
    private String name;
    private double positionX;
    private double positionY;
    Scanner scan = new Scanner(System.in);

    //public Player (String name)
    //{
        //this.name = name;
    //}

    public Player (String name, double positionX, double positionY)
    {
        this.name = name;
        this.positionX = 0;
        this.positionY = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getPositionX()
    {
        return positionX;
    }

    public double getPositionY()
    {
        return positionY;
    }

    public void setName(String name)
    {
        System.out.println("Type the new name.");
        name = scan.next();
    }

    public void moveX(double offsetX)
    {
        this.positionX += offsetX;
    }

    public void moveY(double offsetY)
    {
        this.positionY = this.positionY + offsetY;
    }

    public void moveInDirection(double theta, double distance)
    {

    }

    public boolean hasSamePositionAs(Player player)
    {
        if ((this.positionX == player.positionX) && (this.positionY == player.positionY))
        {
            return true;
        }

        else return false;
    }

    public double distanceFrom(Player player)
    {
        //distance formula
        double distance = Math.sqrt(Math.pow((this.positionX - player.positionX),2) +
                (Math.pow((this.positionY - player.positionY), 2)));
        return distance;
    }

}


