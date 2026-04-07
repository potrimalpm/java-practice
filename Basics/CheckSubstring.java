import java.util.Scanner;

class CheckSubstring
{
   public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        String s2 =  sc.nextLine();

        for(int i=0; i<=s1.length()-s2.length(); i++)
        {
            int check=i;
            int j=0;
            int count=0;
            while(check<s1.length() && j<s2.length() && s1.charAt(check) == s2.charAt(j))
            {
                check++;
                j++;
                count++;
            }
            if(count == s2.length())
            {
                System.out.println("Substring present");
                return;
            }
        }
        System.out.println("Substring not present");
    }
}
