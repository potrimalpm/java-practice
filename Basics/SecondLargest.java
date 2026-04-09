import java.util.Scanner;

class SecondLargest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=sc.nextInt();
        int max=x, secMax=-1;
        for(int i=0; i<n-1; i++)
        {
            x = sc.nextInt();
            if(x > max)
            {
                secMax = max;
                max = x;
            } else if(x > secMax && x != max){
                secMax = x;
            }
        }
        if(secMax >= 0){
            System.out.println(secMax);
        } else{
            System.out.println("No second largest");
        }
    }
}