import java.util.Scanner;
class ReverseString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        int len=str.length();
        for(int i=len-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}