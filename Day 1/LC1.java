import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> aman = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (aman.containsKey(target - nums[i])) {
                int a[] = { aman.get(target - nums[i]), i };
                return a;
            }
            aman.put(nums[i], i);
        }
        return new int[] {};
    }
}
