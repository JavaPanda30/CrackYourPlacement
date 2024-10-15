class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> aman = new PriorityQueue<Integer>(k + 1);
        for (int elem : nums) {
            aman.add(elem);
            if (aman.size() > k) {
                aman.poll();
            }
        }
        return aman.poll();
    }
}