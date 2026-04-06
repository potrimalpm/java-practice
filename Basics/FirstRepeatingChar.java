import java.util.Scanner;
import java.util.HashSet;
class FirstRepeatingChar
{
    public static void main(String[]args)
    {
        HashSet<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the phrase: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i)))
            {
                System.out.println(s.charAt(i));
                return;
            } else{
                set.add(s.charAt(i));
            }
        }
        System.out.println("No Repeating Character");
    }
}