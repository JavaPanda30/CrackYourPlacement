class Solution {

    public int reversePairs(int[] nums) {
        int count = 0;
        count = mergeSort(nums, 0, nums.length - 1);
        return count;
    }

    public int mergeSort(int[] arr, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;
            count += mergeSort(arr, start, mid);
            count += mergeSort(arr, mid + 1, end);
            count += countPairs(arr, start, mid, end);
            merge(arr, start, mid, end);
        }
        return count;
    }

    public int countPairs(int[] arr, int start, int mid, int end) {
        int count = 0;
        int right = mid + 1;
        for (int i = start; i <= mid; i++) {
            while (right <= end && Long.valueOf(arr[i]) > 2 * Long.valueOf(arr[right])) right++;
            count += (right - (mid + 1));
        }
        return count;
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid + 1;
        int[] temp = new int[end - start + 1];
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i];
            i++;
        }
        while (j <= end) {
            temp[k++] = arr[j];
            j++;
        }
        for (int idx = 0; idx < temp.length; idx++) {
            arr[start + idx] = temp[idx];
        }
    }
}
