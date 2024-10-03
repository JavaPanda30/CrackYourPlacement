public class Solution {
    public void solveSudoku(char[][] board) {
        if(solvesudoku(board))
        return;
    }
    public static boolean solvesudoku(char[][] board)
    {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.') {
                    for (char k = '1'; k <='9'; k++) 
                    {
                        if (isvalid(board, i, j, k)) {
                            board[i][j] = k;
                            if (solvesudoku(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isvalid(char[][] board, int row, int col, char num)
    {
        for (int i = 0; i < 9; i++) {
            if((board[row][i] == num) || (board[i][col] == num) || board[row - row % 3 + i / 3][col - col % 3 + i % 3]==num)
            {
                return false;
            }
        }
        return true;
    }
} {
    
}
