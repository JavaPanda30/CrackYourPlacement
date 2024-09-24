class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length-1;
        int ans = 0;
        while(low<high){
            int min = Math.min(height[low],height[high]);
            ans = Math.max(ans,min*(high-low));
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return ans;
    }
}