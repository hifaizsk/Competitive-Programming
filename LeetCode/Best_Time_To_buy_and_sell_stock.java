// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minProfit = Integer.MAX_VALUE;

    for (int price : prices) {
      minProfit = Math.min(price, minProfit);
      maxProfit = Math.max(price - minProfit, maxProfit);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
  }
}