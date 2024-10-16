class Solution {
    public int minCost(String s, int[] nums) {
        int n = s.length();
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                result = result + Math.min(nums[i], nums[i - 1]);
                nums[i] = Math.max(nums[i], nums[i - 1]);
            }
        }
        return result;
    }
}