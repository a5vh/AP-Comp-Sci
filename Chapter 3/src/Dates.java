// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ****************************************************************
import java.util.Scanner;
public class Dates
{
    public static void main(String[] args) {
        int month, day, year; //date read in from user
        int daysInMonth; //number of days in month read in
        int yrdiv;
        boolean monthValid, yearValid, dayValid; //true if input from user is valid
        boolean leapYear; //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
        leapYear = false;
        daysInMonth = 0;
        dayValid = false;
        monthValid = false;
        yearValid = false;
//Get integer month, day, and year from user
        System.out.println("Enter the day, month and year.");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
//Check to see if month is valid
        if (month <= 12) {
            monthValid = true;
        }
//Check to see if year is valid
        if ((year < 2017) & (year > 1000)) {
            yearValid = true;
        }
//Determine whether it's a leap year
        yrdiv = year / 4;
        if (year % 400 == 0) {
            leapYear = true;
        } else if (year % 4 == 0 && !(year % 100 == 0)) {
            leapYear = true;
        }
//Determine number of days in month
        if (leapYear == true)
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                daysInMonth = 31;
            }

            if (month == 2)
            {
                daysInMonth = 29;
            }

            if (month == 4 || month == 6 || month == 9 || month == 11)
            {
                daysInMonth = 30;
            }
        }

        else
        {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
            daysInMonth = 31;
            }

            if (month == 2)
            {
                daysInMonth = 28;
            }

            if (month == 4 || month == 6 || month == 9 || month == 11)
            {
                daysInMonth = 30;
            }
        }
//User number of days in month to check to see if day is valid
        if (day <= daysInMonth)
        {
            dayValid = true;
        }
//Determine whether date is valid and print appropriate message
        if ((dayValid == false) || monthValid == false || yearValid == false)
        {
            System.out.println("The date entered is invalid");
        }

        else
        {
            System.out.println("The date entered is valid");
        }
    }
}