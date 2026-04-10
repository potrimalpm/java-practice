import java.util.Scanner;

class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int price : prices) {
            if(price < min) {
                min = price;
            } else {
                profit = Math.max(profit, price - min);
            }
        }

        System.out.println(profit);
    }
}