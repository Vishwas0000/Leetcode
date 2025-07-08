import java.util.Scanner;

public class sellandbuy{
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of days
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        // Prompt user for prices
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        sellandbuy solution = new sellandbuy ();
        int result = solution.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
