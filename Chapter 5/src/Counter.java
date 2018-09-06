/**
 * Created by augusthummert on 11/16/17.
 */

import java.util.Scanner;

public class Counter {

    int count = 0;

    public int setToZero()
    {
        int zero = count = 0;
        return zero;
    }

    public int increaseByOne()
    {
       return count++;
    }

    public int decreaseByOne()
    {
        return count--;
    }

    public String getCount()
    {
        return "Count: " + count;
    }

}
