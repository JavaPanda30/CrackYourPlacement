class Solution {

    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
        Collections.sort(list,(i1,i2) -> i2.getValue().compareTo(i1.getValue()));
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer,Integer> aman = new HashMap<>();
        for (int i : nums) {
            if (!aman.containsKey(i)) {
                aman.put(i,1);
            }
            else{
            aman.put(i,aman.get(i)+1);
            }
        }
        aman = sortByValue(aman);
        System.out.println(aman);
        int j = 0;
        for (int a : aman.keySet()) {
            if (j == k)
                break;
            ans[j++] = a;
        }
        return ans;
    }
}