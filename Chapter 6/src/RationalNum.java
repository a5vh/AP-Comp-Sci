/**
 * Created by 19augusthummert on 1/11/2018.
 */
public class RationalNum {

    int a = 0;
    int b = 0;

    public RationalNum ()
    {
    }

    public RationalNum (int a , int b)
    {
        this.a = a;
        this.b = b;
        simplify();
    }

    private void simplify()
    {
        int num = getGCD(a,b);
        a = a/num;
        b = b/num;
    }

    private static int getGCD(int number1, int number2)
    {
        if (number2 == 0)
        {
            return number1;
        }
        return getGCD(number2, number1%number2);
    }

    public double getValue()
    {
        double a1 = a;
        double b1 = b;
        return a1/b1;
    }

    public String toString()
    {
        return a + " / "  + b;
    }
}
