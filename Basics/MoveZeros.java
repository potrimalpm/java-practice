import java.util.Scanner;

class MoveZeros
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
        int left = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] != 0){
                arr[left] = arr[i];
                left++;
            }
        }
        while(left<n)
        {
            arr[left] = 0;
            left++;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}