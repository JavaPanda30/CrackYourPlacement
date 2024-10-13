public class Solution {
    public int lengthOfLIS(int[] nums) {
        return helper(nums.length, nums, 0, -1);
    }

    public static int helper(int n, int[] nums, int curr, int prev) {
        int take = 0, notake = 0;
        if (curr == n) {
            return 0;
        }
        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + helper(n, nums, curr + 1, curr);
        }
        notake = helper(n, nums, curr + 1, prev);
        return Math.max(take, notake);
    }
}