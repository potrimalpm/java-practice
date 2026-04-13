import java.util.Scanner;

class ProductOfArrayExceptSelf
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
    int x = 0;
    while(x < n)
    {
        int left = 0, right = n - 1;
        int product = 1;
        for(int i=0; i<n; i++)
        {
            if(i != x){
                product *= arr[i];
            }
        }
        System.out.print(product + " ");
        x++;
    }
    }
}