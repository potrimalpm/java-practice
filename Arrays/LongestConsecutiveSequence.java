import java.util.HashSet;
import java.util.Scanner;

class LongestConsecutiveSequence
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
            set.add(nums[i]);
        }
        int max = 0;
        for(int i : nums)
        {
            if(!set.contains(i-1)){
                int current = i;
                int count = 1;
                while(set.contains(current + 1)){
                    count++;
                    current++;
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}