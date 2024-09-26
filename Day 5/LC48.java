
class Solution {
    public void rotate(int[][] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int j=0;
            while(j<=i){
                int t = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j++][i] = t; 
            }
        }
        for(int i=0;i<n;i++){
            int j=0;
            while(j<n/2){
                int t = nums[i][j];
                nums[i][j] = nums[i][n-1-j];
                nums[i][n-1-j++] = t;
            }
        }
    }
}