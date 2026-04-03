import java.util.Scanner;

class Interest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal");
        int a=sc.nextInt();
        System.out.println("Enter the time period");
        int b=sc.nextInt();
        System.out.println("Enter the rate of interest");
        int c=sc.nextInt();
        int result=(a*b*c)/100;
        System.out.println("The interest is "+result);
    }
}