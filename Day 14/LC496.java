import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        Map<Integer,Integer> map = new Hashmap<>();
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<n2;i++)
        {
            while(!s.isEmpty() && nums2[i]>s.peek())
            {
                map.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()) map.put(s.pop(),-1);
        for(int i=0;i<n1;i++)
        {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
} {
    
}
