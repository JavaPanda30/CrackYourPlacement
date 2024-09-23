class Solution {

    public void sortColors(int[] nums) {
        int idx0 = 0, idx1 = 0, idx2 = nums.length - 1;
        while (idx0<=idx2) {
            if (nums[idx0] == 0) {
                swap(idx0, idx1, nums);
                idx1++;
                idx0++;
            } 
            else if (nums[idx0] == 2) {
                swap(idx0, idx2, nums);
                idx2--;
            } 
            else {
                idx0++;
            }
        }
    }

    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
