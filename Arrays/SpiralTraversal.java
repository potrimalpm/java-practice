import java.util.Scanner;
import java.util.ArrayList;

class SpiralTraversal
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int top=0, right=col-1, bottom=row-1, left=0;
        while(top <= bottom && left <= right)
        {
            for(int i=left; i<=right; i++)
            {
                nums.add(arr[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++)
            {
                nums.add(arr[i][right]);
            }
            right--;
            for(int i=right; i>=left; i--)
            {
                if(top <= bottom)
                    nums.add(arr[bottom][i]);
            }
            bottom--;
            for(int i=bottom; i>=top; i--)
            {
                if(left <= right)
                    nums.add(arr[i][left]);
            }
            left++;
        }
        for(int i : nums)
        {
            System.out.print(i + " ");
        }
    }
}