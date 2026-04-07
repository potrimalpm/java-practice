import java.util.Scanner;

class RemoveSpacesFromString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != ' ') System.out.print(s.charAt(i));
        }
    }
}