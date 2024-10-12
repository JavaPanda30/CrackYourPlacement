public class Solution {
    public static int binarySearch(int nums[],int target,int left,int right)
    {
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            return mid;
            else if(nums[mid]>target)
            right=mid-1;
            else
            left=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
      int i=1,brkpt=0;
      while(i<nums.length)
      {
          if(nums[i-1]>nums[i])
          {
              brkpt=i;
              break;
          }
          i++;
      }
      int ans=Math.max(binarySearch(nums,target,brkpt,nums.length-1),binarySearch(nums,target,0,brkpt));
      return ans;
    }
} {
    
}
