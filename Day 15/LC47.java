class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
        boolean visited[] = new boolean[arr.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        helper(0, arr, visited, ans, lst);
        System.out.println(ans);
        return ans;
    }

    public static void helper(int index, int[] nums, boolean visited[], List<List<Integer>> ans, List<Integer> curr) {
        if (curr.size() == nums.length) {
            List<Integer> a = new ArrayList<>(curr);
            if (!ans.contains(a))
                ans.add(a);
            System.out.println(curr);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                curr.add(nums[i]);
                helper(i + 1, nums, visited, ans, curr);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }
}