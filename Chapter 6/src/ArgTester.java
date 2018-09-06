/**
 * Created by 19augusthummert on 2/2/2018.
 */
public class ArgTester {

    public static void main (String [] args)
    {
        int a = args.length;

        System.out.println("The number of words you entered is " + a);

        for (int i = 0; i < args.length; i++)
        {
            System.out.println("The word at index " + i + " is " + args[i]);
        }
        //OUTPUT THE WORDS THAT ARE IN THE ARRAY args USING A FOR LOOP
        //Use a in your length -- HINT: Remember that the array is indexed
        //0 to length -1
    }
}
