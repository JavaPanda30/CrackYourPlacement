class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, nums, 0, new ArrayList<>());
        return ans;
    }

    public void helper(List<List<Integer>> ans, int[] nums, int i, List<Integer> temp) {
        if (ans.contains(temp))
            return;
        if (i == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(ans, nums, i + 1, temp);
        temp.remove(temp.size() - 1);
        helper(ans, nums, i + 1, temp);
        return;
    }
}