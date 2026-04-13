import java.util.Scanner;
import java.util.Stack;

class ValidParentheses
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        Stack<Character> st = new Stack<>();
        s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                st.push(s.charAt(i));
            } else if(st.empty()){
                System.out.println("False");
                return;
            } else if(s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            } else if(s.charAt(i) == ']' && st.peek() == '['){
                st.pop();
            } else if(s.charAt(i) == '}' && st.peek() == '{'){
                st.pop();
            } else{
                System.out.println("False");
                return;
            }
        }
        if(st.empty()){
            System.out.println("True");
        }
    }
}