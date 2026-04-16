import java.util.Scanner;
import java.util.HashMap;

class SubarraySumK{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int target = sc.nextInt();
        map.put(0, 1);
        int count = 0;
        int runningsum = 0;
        for(int i=0; i<n; i++)
        {
            runningsum += nums[i];
            int neededsum = runningsum - target;
            if(map.containsKey(neededsum)){
                count += map.get(neededsum);
            }
            map.merge(runningsum, 1, Integer::sum);    
        }
        System.out.println(count);
    }
}