import java.util.Scanner;
import java.util.HashSet;
class RemoveDuplicates
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                System.out.print(s.charAt(i));
            }
        }
    }
}