class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> aman = new Stack<>();
        int[] ans = new int[temperatures.length];
        int n = temperatures.length; 
        for (int i = n-1; i>=0 ; i--) {
            while (!aman.isEmpty() && temperatures[i] >= temperatures[aman.peek()]) {
                aman.pop();
            }
            if(!aman.isEmpty()){
                ans[i]=aman.peek()-i;
            }
            aman.push(i);
        }
        return ans;
    }
}
