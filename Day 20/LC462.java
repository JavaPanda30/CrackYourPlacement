class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[(int)nums.length/2];
        int steps=0;
        for(int i:nums){
            steps+=Math.abs(i-mid);
        }
        return steps;
    }
}