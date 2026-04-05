import java.util.Scanner;
class CountVowels
{
    public static void main(String[]args){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.nextLine();
        int count = 0;
        for(char i : s.toCharArray()){
            for(int j=0; j<5; j++){
                if(i == vowels[j]){
                    count++;
                }
            }
        }
        System.out.println("The count of vowels is: "+count);
    }
}