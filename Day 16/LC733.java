class Solution {
    int[] xDir = { 0, 0, -1, 1 };
    int[] yDir = { -1, 1, 0, 0 };

    public void DFS(int[][] image, int i, int j, int actualColor, int color, boolean[][] visited) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != actualColor
                || visited[i][j] == true)
            return;
        visited[i][j] = true;
        image[i][j] = color;
        for (int k = 0; k < 4; k++) {
            int newRow = i + xDir[k];
            int newCol = j + yDir[k];
            DFS(image, newRow, newCol, actualColor, color, visited);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        int actualColor = image[sr][sc];
        DFS(image, sr, sc, actualColor, color, visited);
        return image;
    }
}