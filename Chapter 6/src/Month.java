import java.util.Scanner;
public class Month {

    String[][] calendar;
    String[][] special;
    int[] test;
    String [] testS;
    int starter = 0;
    int day = 1;
    int dayS = 1;
    String calMonth;
    int num;
    int looper;
    int dayMonth = 0;
    boolean startHappened = false;
    Scanner scan = new Scanner(System.in);

    public Month(String monthsFind, String dayer)
    {
        calendar = new String[numRows(monthsFind, dayer)][7];
        special = new String [num][7];
    }

    public int dayStart(String start)
    {
        if (start.equalsIgnoreCase("Sunday"))
            starter = 1;
        else if (start.equalsIgnoreCase("Monday"))
            starter = 2;
        else if (start.equalsIgnoreCase("Tuesday"))
            starter = 3;
        else if (start.equalsIgnoreCase("Wednesday"))
            starter = 4;
        else if (start.equalsIgnoreCase("Thursday"))
            starter = 5;
        else if (start.equalsIgnoreCase("Friday"))
            starter = 6;
        else if (start.equalsIgnoreCase("Saturday"))
            starter = 7;
        else
            System.out.println("Try to spell again");
        return starter;
    }

    public int findMonth(String month)
    {
        calMonth = month;
        if (month.equalsIgnoreCase("January"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("February"))
            dayMonth = 28;
        else if (month.equalsIgnoreCase("March"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("April"))
            dayMonth = 30;
        else if (month.equalsIgnoreCase("May"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("June"))
            dayMonth = 30;
        else if (month.equalsIgnoreCase("July"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("August"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("September"))
            dayMonth = 30;
        else if (month.equalsIgnoreCase("October"))
            dayMonth = 31;
        else if (month.equalsIgnoreCase("November"))
            dayMonth = 30;
        else if (month.equalsIgnoreCase("December"))
            dayMonth = 31;
        else
            System.out.println("Learn how to spell.");
        return dayMonth;
    }


    public int numRows(String monthsFind, String dayer)
    {
        num = 1 +((findMonth(monthsFind) + dayStart(dayer)) /7);
        return num;
    }



    public String month()
    {
        return calMonth;
    }

    public void fillCalendar(int times)
    {
        test = new int[times];
        testS = new String[times];
        amountOfTimes(times);

        for (int r = 0; r < calendar.length; r++)
        {
            for (int c = 0; c < 7; c++)
            {
                calendar[r][c] = "";
                special[r][c] = "";

                if (startHappened)
                {
                    calendar[r][c] = "" + day;
                    day++;
                }

                if ((starter-1) == c)
                {
                    calendar[r][c] = "" + day;
                    startHappened = true;
                    day++;
                    starter = 10;
                }

                if (day == dayMonth)
                {
                    startHappened = false;
                }

                if (test[looper] == (day - 1))
                {
                    special[r][c] = testS[looper];
                    if ((times - 1) != looper)
                        looper++;
                }

                else if (startHappened)
                    special[r][c] = "-";
                else
                    special[r][c] = "";
            }
        }
    }

    public void amountOfTimes(int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println("What day is the special day?");
            int date = scan.nextInt();
            test[i] = date;
            System.out.println("What is this special day called?");
            String name = scan.next();
            testS[i] = name;
        }
    }

    public void fillSpecial(int date, String name)
    {
        for (int row = 0; row < calendar.length; row++)
        {
            for (int col = 0; col < 7; col++)
            {
                special[row][col] = "";
                dayS++;

                if ((date == dayS) && (dayMonth != dayS))
                {
                    special[row][col] = "" + name;
                }
                else
                    special[row][col] = "-";
            }
            date = 0;
        }
    }

    public void printCalendar()
    {
        System.out.println();
        System.out.println("\t\t\t" + month());
        System.out.println("S\tM\tT\tW\tT\tF\tS");

        for (int row = 0; row < calendar.length; row++)
        {
            for (int col = 0; col < 7; col++)
                System.out.print(calendar[row][col] + "\t");
            System.out.println();

            for (int col = 0; col < 7; col++)
                System.out.print(special[row][col] + "\t");
            System.out.println();
        }
    }
}


