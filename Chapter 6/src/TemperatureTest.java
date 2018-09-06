/**
 * Created by 19augusthummert on 1/8/2018.
 */
import java.util.Scanner;
public class TemperatureTest {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Temperature temp = new Temperature();

        temp.setDegrees();
        temp.setScale();
        temp.switchScale();
        temp.print();
        temp.compare();



        }
    }
