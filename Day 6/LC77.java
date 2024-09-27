class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> aman = new ArrayList<>();
        helper(1,n,k,aman,new ArrayList<>());
        return aman;
    }

    public static void helper(int s,int n,int k,List<List<Integer>> aman, ArrayList<Integer>curr){
        if(k==curr.size()){
            List<Integer> ans = new ArrayList<>(curr);
            aman.add(ans);
            return;
        }
        for(int j=s;j<=n;j++){
            curr.add(j);
            helper(j+1,n,k,aman,curr);
            curr.remove(curr.size()-1);
        }
    }
}