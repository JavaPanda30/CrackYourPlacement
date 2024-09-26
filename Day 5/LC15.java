import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[low]);
                    a.add(nums[high]);
                    ans.add(a);
                    low++;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                }
                if (sum > 0) {
                    high--;
                } else if (sum < 0) {
                    low++;
                }
            }

        }
        return new ArrayList<>(ans);
    }
}