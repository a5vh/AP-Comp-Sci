/**
 * Created by 19augusthummert on 10/12/2017.
 */
public class Anchorman {

    public static void main(String[] args) {

        String s1 = "ANCHORMAN";
        System.out.println(s1.substring(0, s1.indexOf("M")) + s1.substring(s1.indexOf("M")).toLowerCase());

    }
}
