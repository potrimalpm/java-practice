import java.util.Scanner;

class FirstUniqueChar
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0;
        while(i<str.length())
        {
            int j = i+1;
            int k = i-1;
            while(j<str.length())
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    break;
                }
                j++;
            }
            while(i!=0 && k>=0){
                if(str.charAt(i) == str.charAt(k))
                {
                    break;
                }
                k--;
            }
            if(j == str.length() && k<0)
            {
                System.out.println(str.charAt(i));
                return;
            }
            i++;
            
        }
    }
}