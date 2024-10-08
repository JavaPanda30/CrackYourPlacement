class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        traverse(list, 0, s, new ArrayList<String>());
        return list;
    }

    public void traverse(List<List<String>> list, int index, String s, List<String> current) {
        if (index == s.length()) {
            list.add(new ArrayList<String>(current));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                current.add(s.substring(index, i + 1));
                traverse(list, i + 1, s, current);
                current.remove(current.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int low, int high) {
        while (low <= high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }
}
