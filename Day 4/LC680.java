class Solution {

    public boolean validPalindrome(String s) {
        int idx1 = 0, idx2 = s.length() - 1;
        while (idx1 < idx2) {
            if (s.charAt(idx1) != s.charAt(idx2)) {
                return isPalindrome(s, idx1 + 1, idx2) || isPalindrome(s, idx1, idx2 - 1);
            }
            idx1++;
            idx2--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int idx1, int idx2) {
        while (idx1 < idx2) {
            if (s.charAt(idx1) != s.charAt(idx2)) {
                return false;
            }
            idx1++;
            idx2--;
        }
        return true;
    }
}
