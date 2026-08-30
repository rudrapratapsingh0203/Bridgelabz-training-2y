public class BestTimeTOBuyAndSellStock2 {
    public static void main(String[] args) {
        BestTimeTOBuyAndSellStock2 obj = new BestTimeTOBuyAndSellStock2();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = obj.maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
   }
}
