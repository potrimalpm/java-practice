import java.util.Scanner;
import java.util.HashMap;

class GroupAnagrams
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextLine();
            char[] charArr = arr[i].toCharArray();
            java.util.Arrays.sort(charArr);
            String sorted = new String(charArr);            
            map.merge(sorted, arr[i], (oldVal, newVal) -> oldVal + " " + newVal);
        }
        for (String i : map.values()) {
            System.out.println(i);
        }       
    }
}