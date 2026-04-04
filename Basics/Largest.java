import java.util.Scanner;

class Largest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the secons number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The greatest number is "+a);
        }
        else if(b>c){
            System.out.println("The greatest number is "+b);
        }
        else{
            System.out.println("The greatest number is "+c);
        }
    }
}