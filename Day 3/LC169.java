class Solution {

    public int majorityElement(int[] nums) {
        int votes = 0, candidate = 0;
        for (int i : nums) {
            if (votes == 0) {
                candidate = i;
            }
            if (candidate == i) {
                votes++;
            } else {
                votes--;
            }
        }
        return candidate;
    }
}


