/**
 * Created by 19augusthummert on 11/6/2017.
 */
import java.util.Scanner;

public class Name {

    String fName, mName, lName;

    public Name(String first, String middle, String last) {
        fName = first;
        mName = middle;
        lName = last;
    }


        public String getFrist()
        {
           return fName;
        }

        public String getmMiddle()
        {
            return mName;
        }

        public String getLast()
        {
            return lName;
        }

        public String firstMiddleLast()
        {
            return fName + " " + mName + " " + lName;
        }


        public String lastFirstMiddle()
        {
            return lName + " " + fName + " " + mName;
        }

        public boolean equals(Name otherName)
        {
            return (firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()));
        }


        public String initials()
        {
            return  (fName.substring(0,1) + mName.substring(0,1) + lName.substring(0,1));
        }

        public int length()
        {
            return (fName.length() + mName.length() + lName.length());
        }





}

