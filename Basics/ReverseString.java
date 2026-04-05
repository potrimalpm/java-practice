import java.util.Scanner;
class ReverseString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        String r = "";
        int k=s.length();
        for(int i=k-1; i>=0; i--){
            r += s.charAt(i);
        }
        System.out.println(r);
    }
}