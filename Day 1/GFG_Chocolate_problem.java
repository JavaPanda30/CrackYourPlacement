import java.util.*;

class Solution {
    public long findMinDiff(ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        long max = Long.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            max = Math.min(max, Math.abs(a.get(i) - a.get(i + m - 1)));
        }
        return max;
    }
}