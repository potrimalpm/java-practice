import java.util.*;

class MinimumWindowSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < t.length(); i++)
        {
            map2.merge(t.charAt(i), 1, Integer::sum);
        }
        
        int left = 0, right = 0;
        int formed = 0, required = map2.size();
        int start = 0, min = Integer.MAX_VALUE;
        while(right < s.length())
        {
            map1.merge(s.charAt(right), 1, Integer::sum);
            if(map2.containsKey(s.charAt(right)) &&
               map1.get(s.charAt(right)).intValue() == map2.get(s.charAt(right)).intValue())
            {
                formed++;
            }
            while(formed == required)
            {
                if((right - left + 1) < min)
                {
                    min = right - left + 1;
                    start = left;
                }

                map1.put(s.charAt(left), map1.get(s.charAt(left)) - 1);

                if(map2.containsKey(s.charAt(left)) &&
                   map1.get(s.charAt(left)) < map2.get(s.charAt(left)))
                {
                    formed--;
                }

                left++;
            }
            right++;
        }
        if(min == Integer.MAX_VALUE)
        {
            System.out.println("");
        }
        else
        {
            for(int i = start; i < start + min; i++)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}