import java.text.DecimalFormat;

public class DoubleOut {

    public static void write(double amount)
    {
        if (amount >= 0)
        {
            System.out.print('$');
            writePositive(amount);
        }
        else
        {
            double positiveAmount = amount;
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }
    //Precondition: amount >= 0;
//Displays amount in dollars and cents notation. Rounds
//after two decimal places. Omits the dollar sign.
    private static void writePositive(double amount)
    {
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        System.out.print(dollars);
        System.out.print('.');
        if (cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }

    public static void writeln(double amount)
    {
        write(amount);
        System.out.println();
    }

    public static void write(double number, int digitsAfterPoint)
    {
        if (number >= 0)
            writePositive(number, digitsAfterPoint);
        else
        {
            double positiveNumber = -number;
            System.out.print('-');
            writePositive(positiveNumber, digitsAfterPoint);
        }
    }

    //Precondition: number >= 0
    //Displays a number with digitsAfterPoint digits after
    //the decimal point. Rounds any extra digits.
    private static void writePositive(double number, int digitsAfterPoint)
    {
        int mover = (int)(Math.pow(10, digitsAfterPoint));
        //1 followed by digitsAfterPoint zeros
        int allWhole; //number with the decimal point
        //moved digitsAfterPoint places
        allWhole = (int)(Math.round(number * mover));
        int beforePoint = allWhole / mover;
        int afterPoint = allWhole % mover;
        System.out.print(beforePoint);
        System.out.print('.');
        writeFraction(afterPoint, digitsAfterPoint);
    }

    //Displays the integer afterPoint with enough zeros
    //in front to make it digitsAfterPoint digits long.
    private static void writeFraction(int afterPoint, int digitsAfterPoint)
    {
        int n = 1;
        while (n < digitsAfterPoint){
            if (afterPoint < Math.pow(10, n))
                System.out.print('0');
            n = n + 1;
        }
        System.out.print(afterPoint);
    }

    /* scienceWrite takes a double and prints out the double in scientific notation*/

    private static void scienceWrite(double amount)
    {
        DecimalFormat df = new DecimalFormat("0.00E0");
        System.out.print(df.format(amount));
    }

    public static void scienceWriteln(double amount){
        scienceWrite(amount);
        System.out.println();
    }

}
