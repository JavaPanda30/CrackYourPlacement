class Solution {
    // Two Pointer --Space Optimized part for DP
    public int uniquePaths(int m, int n) {
        int[] prev = new int[n];
        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];
            for (int j = 0; j < n; j++) {
                // Base condition
                if (i == 0 || j == 0) {
                    temp[j] = 1;
                    continue;
                }
                int upper = 0;
                int left = 0;

                //Retreive Upper cell value from prev --default is 0
                if (i > 0) {
                    upper = prev[j];
                }
                //Retreive Left Side cell value from temp -- default is 0 (on line 10 this is stored and after that is added till next values)
                if (j > 0) {
                    left = temp[j - 1]; 
                }
                temp[j] = upper + left;
            }
            prev = temp;
        }
        return prev[n - 1];
    }

    // Recursive --Use Base Case for Row and Column

    // TLE

    public int helper(int r, int c, int m, int n) {
        if (r == m - 1) {
            return 1;
        }
        if (c == n - 1) {
            return 1;
        }
        return helper(r + 1, c, m, n) + helper(r, c + 1, m, n);
    }

    // Memoization --Top Down = Start with Final Condition- dp[m-1][n-1]

    // TLE

    public int helper(int[][] dp, int m, int n) {
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        if (m == dp.length - 1 || n == dp[0].length - 1) {
            return dp[m][n] = 1;
        }
        return helper(dp, m + 1, n) + helper(dp, m, n + 1);
    }

    // Tabulation --Bottom Up = Start with base case

    // AC Solution

    // to Call this

    // int dp[][] = new int[m][n];
    // for (int i = 0; i < m; i++) {
    // dp[i][0] = 1;
    // }
    // for (int i = 0; i < n; i++) {
    // dp[0][i] = 1;
    // }
    // return helper(1, 1, dp);

    public int helper(int m, int n, int[][] dp) {
        for (int i = m; i < dp.length; i++) {
            for (int j = n; j < dp[0].length; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }

}
