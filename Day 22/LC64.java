class Solution {
    int dp[][];
    int n;
    int m;

    public int backtrack(int[][] grid, int i, int j) {
        if (i >= n || j >= m)
            return Integer.MAX_VALUE;
        if (i == n - 1 && j == m - 1)
            return grid[n - 1][m - 1];
        if (dp[i][j] != 0)
            return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(backtrack(grid, i + 1, j), backtrack(grid, i, j + 1));
    }

    public int minPathSum(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        dp = new int[n][m];
        dp[n - 1][m - 1] = grid[n - 1][m - 1];
        backtrack(grid, 0, 0);
        return dp[0][0];
    }
}