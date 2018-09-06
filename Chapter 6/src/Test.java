/**
 * Created by 19augusthummert on 2/21/2018.
 */
public class Test {

    public static void main (String [] args)
    {
        int[] nums = {5, 10, 6, 2, 8, 1};
        int sum = 0;

        for (int i = 1; i<nums.length; i++)
        {
            if (nums[i-1] > nums[i])
                sum += nums[i-1];
            else
                sum += nums[i];

        }
        System.out.println(sum);
    }
}
