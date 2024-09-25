class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> aman = new ArrayList<>();
        backtrack(0, 0, n, "", aman);
        return aman;
    }

    public static void backtrack(int open, int close, int n, String a, List<String> aman) {
        if (open == close && open == n) {
            aman.add(a);
            return;
        }
        if (open < n) {
            backtrack(open + 1, close, n, a + "(", aman);
        }
        if (close < open) {
            backtrack(open, close + 1, n, a + ")", aman);
        }
        return;
    }
}
