import java.util.Scanner;

public class DoubleOutTest {
    public static void main (String [] args){
        DoubleOut printer = new DoubleOut();
        Scanner scan = new Scanner(System.in);
        String response = "y";
        double amount;

        while(response.equals("y")){
            System.out.println("Please input a double.");
            amount = scan.nextDouble();
            scan.nextLine();

            printer.writeln(amount);
            printer.write(amount, 5);
            System.out.println();
            printer.scienceWriteln(amount);

            System.out.println();
            System.out.println("Would you like to continue? (y or n)");
            response = scan.nextLine();
        }

    }
}
