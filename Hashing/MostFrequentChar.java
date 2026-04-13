import java.util.Scanner;
import java.util.HashMap;
class MostFrequentChar
{
    public static void main(){
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        int max = 0;
        char result = ' ';
        for(int i=0; i<s.length(); i++){
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        for(char i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                result = i;
            }
        }
        System.out.println("The character with max frequency is: "+result);
    }
}