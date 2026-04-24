import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class LongestSubarrayWithSumK
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int i = 0, sum = 0, max = 0;
        while(i < n)
        {
            sum += arr[i];
            if(sum == target)
            {
                max = Math.max(max, i+1);
            }
            int needed = sum - target;
            if(map.containsKey(needed))
            {
                max = Math.max(max, i-map.get(needed));
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            i++;
        }
        System.out.println(max);
    }
}