package AthletePartnerProgram;

/**
 * Created by 19augusthummert on 4/2/2018.
 */
public class BaseballPlayer extends Athlete {

    String fName;
    String lName;
    int grade;
    String throwsWith;
    String batsWith;
    int numBats;
    int numHits;
    int batAvg;

    public BaseballPlayer(String fName, String lName, int grade, String throwsWith, String batsWith,
                          int numBats, int numHits, int batAvg)
    {
        super(fName, lName, grade);
    }

    public int compareTo(BaseballPlayer b)
    {
        BaseballPlayer baseball = new BaseballPlayer(fName, lName, grade, throwsWith, batsWith, numBats,
                numHits, batAvg);
        if (baseball.batAvg < b.batAvg)
        {
            return -1;
        }

        if (b.batAvg < baseball.batAvg)
        {
            return 1;
        }
        else return 0;
    }
}
