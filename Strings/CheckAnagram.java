import java.util.HashMap;
import java.util.Scanner;

class CheckAnagram
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        System.out.print("Enter the first word: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the secong word: ");
        String s2 = sc.nextLine();
        if(s1.length() != s2.length())
        {
            System.out.println("Not Anagram");
            return;
        }
        for(int i=0; i<s1.length(); i++)
        {
            map1.merge(s1.charAt(i), 1, Integer::sum);
            map2.merge(s2.charAt(i), 1, Integer::sum);
        }
        if(map1.equals(map2))
        {
            System.out.println("Anagram");
        } else{
            System.out.println("Not Anagram");
        }
    }
}