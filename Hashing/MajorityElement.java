import java.util.Scanner;
import java.util.HashMap;

class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        for(int num : nums) {
            if(map.get(num) > n/2) {
                System.out.println(num);
                return;
            }
        }
    }
}