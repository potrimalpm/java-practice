import java.util.Scanner;

class StudentGrade
{

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c)/3;
        if(avg >= 90){
            System.out.println("Grade A");
        } else if(avg >= 75){
            System.out.println("Grade B");
        } else if(avg >= 50){
            System.out.println("Grade C");
        } else{
            System.out.println("Fail");
        }
    }
}