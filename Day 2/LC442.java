class Solution {

    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int a = Math.abs(arr[i]);
            if (arr[a - 1] < 0) {
                ans.add(a);
            } else {
                arr[a - 1] *= -1;
            }
        }
        return ans;
    }
}
