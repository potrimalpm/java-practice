import java.util.HashMap;
import java.util.Scanner;

class MostFrequentCharacter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        int max=0;
        for(int i=0; i<s.length(); i++)
        {
            max = Math.max(max, map.get(s.charAt(i)));
        }
        for(int i=0; i<s.length(); i++)
        {
            if(map.get(s.charAt(i)) == max)
            {
                System.out.print(s.charAt(i));
                return;
            }
        }
    }
}