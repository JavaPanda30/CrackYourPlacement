class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ht = new HashMap<>();
        for (String s : strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String _s = new String(temp);
            if (!ht.containsKey(_s)) {
                ht.put(_s, new ArrayList<>());
            }
            ht.get(_s).add(s);
        }
        return new ArrayList<>(ht.values());
    }
}
