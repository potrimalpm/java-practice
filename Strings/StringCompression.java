import java.util.Scanner;

class StringCompression
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        int i = 0;
        while(i<s.length())
        {
            int count = 1;
            int right = i + 1;
            while(right<s.length() && s.charAt(i) == s.charAt(right))
            {
                count++;
                right++;
            }
            System.out.print(s.charAt(i) + "" + count);
            i = right;
        }
    }
}