// import java.util.Arrays;

// class GFG {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 8, 10, 10, 12, 19 };
//         int n = arr.length;
//         int x = 8;
//         int idx = Arrays.binarySearch(arr, x);
//         if (idx < 0) {
//             idx = Math.abs(idx) - 1;
//         }
//         if (idx == n) {
//             System.out.println(
//                     "Ceiling Element does not exist");
//         } else {
//             System.out.println("Ceiling Element of " + x + " is " + arr[idx]);
//         }
//     }
// }

class Main {
    static int ceilSearch(int arr[], int low, int high, int x) {
        if (x == 0) {
            return -1;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (x == arr[mid]) {
                return mid;
            }
            if (x < arr[mid]) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
