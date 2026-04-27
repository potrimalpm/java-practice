import java.util.HashSet;
import java.util.Scanner;

class LongestSubstringWithoutRepeating
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String s = sc.nextLine();
        int left = 0, right = 0, max = 0;
        while(right < s.length())
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
            max = Math.max(max, right - left);
        }
        System.out.println(max);
    }
}