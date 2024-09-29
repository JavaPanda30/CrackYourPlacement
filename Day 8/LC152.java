class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int left = 1, right = 1;
        for (int i = 0; i < n; i++) {
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;
            left = left * nums[i];
            right = right * nums[n - i - 1];
            max = Math.max(max, Math.max(left, right));
        }
        return max;
    }
}