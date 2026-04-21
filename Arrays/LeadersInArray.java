import java.util.Scanner;
import java.util.ArrayList;

class LeadersInArray
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int i = n - 1;
        while(i >= 0)
        {   
            if(arr[i] >= max)
            {
                nums.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
            i--;
        }

        for(int x=nums.size()-1; x>=0; x--)
        {
            System.out.print(nums.get(x) + " ");
        }
    }
}