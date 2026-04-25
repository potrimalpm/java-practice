import java.util.Scanner;

class KadaneMaxSubarray
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int curr = arr[0], max = arr[0];
        int i = 1;
        while(i < n)
        {
            curr = Math.max(curr + arr[i], arr[i]);
            max = Math.max(max, curr);
            i++;
        }
        System.out.println(max);
    }
}