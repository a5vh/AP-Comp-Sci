package AthletePartnerProgram;

/**
 * Created by 19augusthummert on 3/12/2018.
*/
public class Athlete implements Comparable<Athlete>
{
    String firstName, lastName;
    int studGrade;
    public Athlete(String firstN, String lastN, int grade)
    {
        firstName = firstN;
        lastName = lastN;
        studGrade = grade;
    }
//Override compareTo()
    public int compareTo(Athlete b)
    {
        Athlete athlete = new Athlete(firstName, lastName, studGrade);
        return (this.lastName.compareTo(b.lastName));
    }
//Student that is largest comes first in alphabet

//method to get full student name
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
//method to get student grade
    public int getGrade()
    {
        return studGrade;
    }
//method to sort an array or arrayList of Athletes
    public void sortAthletes(Comparable[] a)
    {

    }

}





