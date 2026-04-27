import java.util.HashMap;
import java.util.Scanner;

class LongestRepeatingCharacterReplacement
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        String s = sc.nextLine();
        int n = sc.nextInt();
        int left = 0, right = 0, maxFreq = 0, maxLen = 0;
        while(right < s.length())
        {
            map.merge(s.charAt(right), 1, Integer::sum);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            if((right - left + 1) - maxFreq > n)
            {
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        System.out.println(maxLen);
    }
}