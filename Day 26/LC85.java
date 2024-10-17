class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int columnCount = matrix.length, rowCount = matrix[0].length, max = 0;
        int[] count = new int[rowCount];
        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < rowCount; j++)
                if (matrix[i][j] == '1') {
                    count[j]++;
                } else {
                    count[j] = 0;
                }
            for (int j = 0; j < rowCount; j++) {
                int currentCount = count[j];
                while (currentCount > 0) {
                    int columnNumber = 1;
                    for (int idx = j + 1; idx < count.length; idx++)
                        if (currentCount <= count[idx]) {
                            columnNumber++;
                        } else {
                            break;
                        }
                    max = Math.max(max, columnNumber * currentCount);
                    currentCount--;
                }
            }
        }
        return max;
    }
}