
class Solution {

    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        int ans = -1;

        if (len1 < len2) {
            ans = -1;
        } else if (len1 == len2) {
            ans = haystack.equals(needle) ? 0 : -1;
        } else {
            for (int i = 0; i <= len1 - len2; i++) {
                if (haystack.substring(i, len2 + i).equals(needle)) {
                    ans = i;
                    break;
                }
            }
        }
        return ans;
    }
}
