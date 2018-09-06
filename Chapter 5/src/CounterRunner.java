/**
 * Created by augusthummert on 11/16/17.
 */

import java.util.Scanner;

public class CounterRunner {

    public static void main(String[] args) {

        Counter c1 = new Counter();

        System.out.println(c1.getCount());
        c1.increaseByOne();
        System.out.println(c1.getCount());
        c1.increaseByOne();
        System.out.println(c1.getCount());
        c1.decreaseByOne();
        System.out.println(c1.getCount());
        c1.setToZero();
        System.out.println(c1.getCount());


    }
}
