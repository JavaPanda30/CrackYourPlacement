import java.util.*;
class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int max = prices[0];
        int min = prices[0];
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] <= prices[i + 1]) {
                max = prices[i + 1];
            } else {
                profit += (max - min);
                max = prices[i + 1];
                min = prices[i + 1];
            }
        }
        return (max - min) + profit;
    }
}


// DP Approach

// class Solution {

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(prices, 0, 1, dp);
    }

    public int helper(int[] prices, int i, int buy, int[][] dp) {
        if (i == prices.length) {
            return 0;
        }
        if (dp[i][buy] != -1) {
            return dp[i][buy];
        }
        int take, notTake;
        if (buy == 1) { 
            take = -prices[i] + helper(prices, i + 1, 0, dp); 
            notTake = helper(prices, i + 1, 1, dp); 
        } else { 
            take = prices[i] + helper(prices, i + 1, 1, dp);
            notTake = helper(prices, i + 1, 0, dp); 
        }
        dp[i][buy] = Math.max(take, notTake);
        return dp[i][buy];
    }
// }