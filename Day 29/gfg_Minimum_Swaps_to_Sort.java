class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[])
    {
        // Code here
        int n = arr.length;
        int[][] arrWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            arrWithIndex[i][0] = arr[i];
            arrWithIndex[i][1] = i;
        }
        Arrays.sort(arrWithIndex, Comparator.comparingInt(a -> a[0]));
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] || arrWithIndex[i][1] == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arrWithIndex[j][1];
                cycleSize++;
            }
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
}