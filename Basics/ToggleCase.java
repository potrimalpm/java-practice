import java.util.Scanner;

class ToggleCase
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                System.out.print((char)(s.charAt(i) - 32));
            } else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                System.out.print((char)(s.charAt(i) + 32));
            } else{
                System.out.print(s.charAt(i));
            }
        }
    }
}