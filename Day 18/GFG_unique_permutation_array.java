class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arrList, int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[] arr = arrList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        backtrack(arr, new ArrayList<>(), used, result);
        return result;
    }

    private static void backtrack(int[] arr, List<Integer> current, boolean[] used,
            ArrayList<ArrayList<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i] || (i > 0 && arr[i] == arr[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            current.add(arr[i]);
            backtrack(arr, current, used, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

};