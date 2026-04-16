import java.util.Scanner;
import java.util.HashMap;

class TwoSum{
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
        for(int i=0; i<n; i++)
        {
            int k = target - nums[i];
            if(map.containsKey(k)){
                System.out.print(k + " " + nums[i]);
                return;
            }
            map.put(nums[i], i);
        }
        System.out.println("No pair found");
    }
}