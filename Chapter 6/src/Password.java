import java.util.Scanner;

/**

 * Created by 19augusthummert on 2/19/2018.

 */

public class Password {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        String[] pin = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int newAdd;

        final int PIN_LENGTH = 5;

        String[] random = new String[9];

        System.out.println("Enter your real 5 digit pin number.");

        String actualPin = scan.next();

        for(int x = 0; x < 9; x++)

        {

            do {

                newAdd = (int)(Math.random()*10);

            }

            while(newAdd>3 || newAdd==0);

            random[x] = ""+newAdd;

        }

        for(int x = 0; x < 9; x++)

        {

            System.out.print(pin[x]);

            System.out.print(" ");

        }

        System.out.println();

        for(int x = 0; x < 9; x++)

        {

            System.out.print(random[x]);

            System.out.print(" ");

        }

        System.out.println("\nEnter your secret pin.");

        String veiledPin = scan.next();

        boolean one = false, two = false, three = false, four = false, five = false;

        for(int x=0; x<5; x++){

            if(veiledPin.substring(x,x+1).equalsIgnoreCase("1")){

                for(int i=0; i<9; i++){

                    if(random[i].equalsIgnoreCase("1")) {

                        if(actualPin.substring(x,x+1).equalsIgnoreCase(pin[i])) {

                            switch(x)

                            {

                                case 0:

                                    one=true;

                                    break;

                                case 1:

                                    two=true;

                                    break;

                                case 2:

                                    three=true;

                                    break;

                                case 3:

                                    four=true;

                                    break;

                                case 4:

                                    five=true;

                                    break;

                            }

                        }

                    }

                }

            }

            if(veiledPin.substring(x,x+1).equalsIgnoreCase("2")){

                for(int i=0; i<9; i++){

                    if(random[i].equalsIgnoreCase("2")) {

                        if(actualPin.substring(x,x+1).equalsIgnoreCase(pin[i])) {

                            switch(x)

                            {

                                case 0:

                                    one=true;

                                    break;

                                case 1:

                                    two=true;

                                    break;

                                case 2:

                                    three=true;

                                    break;

                                case 3:

                                    four=true;

                                    break;

                                case 4:

                                    five=true;

                                    break;

                            }

                        }

                    }

                }

            }

            if(veiledPin.substring(x,x+1).equalsIgnoreCase("3")){

                for(int i=0; i<9; i++){

                    if(random[i].equalsIgnoreCase("3")) {

                        if(actualPin.substring(x,x+1).equalsIgnoreCase(pin[i])) {

                            switch(x)

                            {

                                case 0:

                                    one=true;

                                    break;

                                case 1:

                                    two=true;

                                    break;

                                case 2:

                                    three=true;

                                    break;

                                case 3:

                                    four=true;

                                    break;

                                case 4:

                                    five=true;

                                    break;

                            }

                        }

                    }

                }

            }


        }

        if(one && two && three && four && five) {

            System.out.println("Pin is correct");

        } else {

            System.out.println("Pin is incorrect");

        }

    }

}