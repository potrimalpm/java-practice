import java.util.Scanner;
class Palindrome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("false");
                return;
            }
            right--;
            left++;
        }
        System.out.println("true");
    }
}