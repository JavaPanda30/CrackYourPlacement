class Solution {
    public int maxScore(int[] cardPoints, int k) {
     
    int sum = 0;
        int i,j=cardPoints.length-1;
        for ( i = 0; i < k; i++) {
            sum = sum + cardPoints[i];
        }
        i--;
        int max = sum;
        while (i >= 0) { 
            sum = sum - cardPoints[i] + cardPoints[j];
            i--;
            j--;
            max = Math.max(max, sum);  
        }
        return max;
    }
}