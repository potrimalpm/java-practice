import java.util.Scanner;

class ReverseHalvesOfString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        for(int i=s.length()/2-1; i>=0; i--)
        {
            System.out.print(s.charAt(i));
        }
        for(int i=s.length()-1; i>=s.length()/2; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}