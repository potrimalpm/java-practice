import java.util.Scanner;
import java.util.HashSet;

class IntersectionOfArrays
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for(int i=0; i<a; i++)
        {
            arr1[i] = sc.nextInt();
            set1.add(arr1[i]);
        }
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for(int i=0; i<b; i++)
        {
            arr2[i] = sc.nextInt();
            if(!set2.contains(arr2[i]) && set1.contains(arr2[i])){
                System.out.print(arr2[i] + " ");
                set2.add(arr2[i]);
            }
        }
    }
}