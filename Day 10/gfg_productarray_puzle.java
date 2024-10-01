public class gfg_productarray_puzle {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        long[] ans = new long[nums.length];
        Arrays.fill(ans,1);
        int pref=1,suff=1;
        for(int i=0;i<nums.length;i++){
            ans[i]*=pref;
            pref*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=suff;
            suff*=nums[i];
        }
        return ans;
    }
    
}
