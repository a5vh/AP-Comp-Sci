/**
 * Created by 19augusthummert on 9/13/2017.
 */
public class StringWksht {
    public static void main(String[] args) {
        String que;
        String x = new String("I LOVE");
        String y = new String("java");

        que = x.concat(y);
        System.out.println(que);
        que = x.toLowerCase();
        System.out.println(que);
        que = y.toUpperCase();
        System.out.println(que);
        que = y.toLowerCase();
        System.out.println(que);
        que = x.toUpperCase();
        System.out.println(que);
        que = y.substring(0,3);
        System.out.println(que);
        que = y.substring(1);
        System.out.println(que);
        que = x.substring(2,5);
        System.out.println(que);
        int s = x.length();
        System.out.println(s);


    }
}
