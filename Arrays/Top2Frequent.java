import java.util.Scanner;
import java.util.HashMap;

class Top2Frequent
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max = 0, secMax=0;
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
            map.merge(nums[i], 1, Integer::sum);
            if(max < map.get(nums[i]))
            {
                secMax = max;
                max = map.get(nums[i]);
            }
        }
        for(int i : map.keySet())
        {
            if(map.get(i) == max) System.out.print(i + " ");
            if(map.get(i) == secMax) System.out.print(i + " ");
        }
    }
}