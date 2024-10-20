class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int smallestMissing = 1;
        for (int num : arr) {
            if (num == smallestMissing) {
                smallestMissing++; 
            }
        }
        return smallestMissing; 
    }
}
