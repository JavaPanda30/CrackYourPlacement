class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> aman = new ArrayList<>();
        int[][] visited = new int[n][n];
        helper(aman, visited, 0);
        return aman;
    }

    public static void helper(List<List<String>> aman, int[][] visited, int row) {
        if (row == visited.length) {
            fillBoard(visited, aman);
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (isSafe(visited, row, i)) {
                visited[row][i] = 1;
                helper(aman, visited, row + 1);
                visited[row][i] = 0;
            }
        }
        return;
    }

    public static boolean isSafe(int[][] visited, int row, int col) {
        // Check in that column
        for (int i = 0; i < row; i++) {
            if (visited[i][col] == 1) {
                return false;
            }
        }
        // Check in that
        int minLeft = Math.min(row, col);
        for (int i = 1; i <= minLeft; i++) {
            if (visited[row - i][col - i] == 1) {
                return false;
            }
        }
        int rightmax = Math.min(row, visited.length - col - 1);
        for (int i = 1; i <= rightmax; i++) {
            if (visited[row - i][col + i] == 1)
                return false;
        }
        return true;
    }

    static void fillBoard(int[][] arr, List<List<String>> ans) {
        List<String> board = new ArrayList<>();
        for (int a[] : arr) {
            String str = "";
            for (int p : a) {
                if (p == 1)
                    str = str + "Q";
                else
                    str = str + ".";
            }
            board.add(str);
        }
        ans.add(board);
    }
}
