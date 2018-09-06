/**
 * Created by 19augusthummert on 1/8/2018.
 */
import java.util.Scanner;

public class Temperature {

    Scanner scan = new Scanner(System.in);
    float temp = 0;
    char scale = ' ';
    float temp2 = 0;
    float temp3 = 0;

    public Temperature (float temp)
    {
        this.temp = 0;
    }

    public Temperature (String scale)
    {
        this.scale = ' ';
    }

    public Temperature (float temp, String scale)
    {
        this.temp = 0;
        this.scale = ' ';
    }

    public Temperature () {
    }

    public void switchScale()
    {
        if (scale == 'F') {
            scale = 'C';
            temp3 = (temp - 32) * (5 / 9);
            temp = temp3;
            System.out.println("Temperature in " + scale + ":" + temp3);
        }

        else if (scale == 'C')
        {
            scale = 'F';
            temp3 = (temp * (9/5) + 32);
            temp = temp3;
            System.out.println("Temperature in " + scale + ":" + temp3);
        }
    }

   /** public void celciusToFahren()
    {
        scale = 'F';
        temp3 = (temp * (9/5) + 32);
        temp = temp3;
        System.out.println("Temperature in " + scale + ":" + temp3);

    }

    public void fahrenToCelcius()
    {
        scale = 'C';
        temp3 = (temp - 32) * (5/9);
        temp = temp3;
        System.out.println("Temperature in " + scale + ":" + temp3);
    }
*/

    public void setDegrees()
    {
        System.out.println("Enter the amount of degrees:");
        temp = scan.nextFloat();
    }

    public void setScale()
    {
        System.out.println("Enter the scale:");
        scale = scan.next().charAt(0);
    }

    public void setBoth()
    {
        setDegrees();
        setScale();
    }

    public void compare()
    {
        System.out.println("Enter another temperature to compare.");
        temp2 = scan.nextFloat();
        float thistemp = temp;
        float othertemp = temp2;
        if (thistemp > othertemp)
        {
            System.out.println("The first temperature is greater than the second");
        }

        if (thistemp < othertemp)
        {
            System.out.println("The first temperature is less than the second");
        }

        if (thistemp == othertemp)
        {
            System.out.println("The temperatures are equal");
        }

        else System.out.println("The second temperature is greater than the first");
    }

    public void print()
    {
        System.out.println("Temperature: " + temp);
        System.out.println("Scale: " + scale);
    }

}
