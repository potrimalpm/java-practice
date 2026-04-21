import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class FrequencySort
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            map.merge(arr[i], 1, Integer::sum);
        }
        for(int i : map.keySet())
        {
            int x = map.get(i);
            while(x > 0)
            {
                nums.add(i);
                x--;
            }
        }
        Collections.sort(nums, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a - b; // smaller number first
            } else {
                return map.get(b) - map.get(a); // higher freq first
        }
        }); 
        for(int x : nums)
        {
            System.out.print(x + " ");
        }
    }
}