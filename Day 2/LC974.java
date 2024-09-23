class Solution {

    public int subarraysDivByK(int[] nums, int k) {
        int res = 0;
        int prefSum = 0;
        int[] sumCount = new int[k];
        sumCount[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];
            int mod = Math.floorMod(prefSum, k);
            res += sumCount[mod];
            sumCount[mod]++;
        }

        return res;
    }
}
