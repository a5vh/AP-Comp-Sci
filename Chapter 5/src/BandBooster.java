/**
 * Created by 19augusthummert on 11/14/2017.
 */
import java.util.Scanner;

public class BandBooster {

    private String name;
    private int boxesSold;


    public BandBooster(String boosterName)
    {
        name = boosterName;
        boxesSold = 0;
    }

    public String getName()
    {
        return name;
    }

    public void updateSales(int anotherInt)
    {
        boxesSold += anotherInt;
    }

    public String toString()
    {
        return name + ": " + boxesSold + " boxes";
    }

}
