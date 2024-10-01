class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            int cnt=0,num=i;
            while(num>0){
                if(num%2==1){
                    cnt++;
                }
                num=num/2;
            }
            ans[i]=cnt;
        }
        return ans;
    }
}