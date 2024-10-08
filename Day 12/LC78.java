class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int l = (int) Math.pow(2, n);
        for (int i = 0; i < l; i++) {
            ans.add(helper(i, nums));
        }
        return ans;
    }

    public static List<Integer> helper(int a, int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int idx = 0;
        while (a != 0) {
            if (a % 2 != 0) {
                ans.add(nums[idx]);
            }
            idx++;
            a = a >> 1;
        }
        return ans;
    }
}