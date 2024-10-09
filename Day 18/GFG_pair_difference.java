class Solution {
    public int findPair(int n, int x, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num + x) || set.contains(num - x)) {
                return 1;
            }
            set.add(num);
        }
        return -1;
    }
}
