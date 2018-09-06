/**
 * Created by 19augusthummert on 10/9/2017.
 */
import java.util.Scanner;

public class Book3_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4, num5, tempnum;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        tempnum = 0;

        if (num1 > num2) {
            tempnum = num1;
            num1 = num2;
            num2 = tempnum;
        }

        if (num2 > num3) {
            tempnum = num2;
            num2 = num3;
            num3 = tempnum;
        }

        if (num3 > num4) {
            tempnum = num3;
            num3 = num4;
            num4 = tempnum;
        }

        if (num4 > num5) {
            tempnum = num4;
            num4 = num5;
            num5 = tempnum;
        }

        if (num1 > num2) {
            tempnum = num1;
            num1 = num2;
            num2 = tempnum;
        }

        if (num2 > num3) {
            tempnum = num2;
            num2 = num3;
            num3 = tempnum;
        }

        if (num3 > num4) {
            tempnum = num3;
            num3 = num4;
            num4 = tempnum;
        }

        if (num1 > num2) {
            tempnum = num1;
            num1 = num2;
            num2 = tempnum;
        }

        if (num2 > num3) {
            tempnum = num2;
            num2 = num3;
            num3 = tempnum;
        }

        if (num1 > num2) {
            tempnum = num1;
            num1 = num2;
            num2 = tempnum;
        }

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);

     }

}
