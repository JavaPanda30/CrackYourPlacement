/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
    }

    public TreeNode helper(int[] nums, int lft, int rht) {
        if (lft > rht) {
            return null;
        }
        int mid = lft + ((rht-lft) / 2);
        TreeNode rt = new TreeNode(nums[mid]);
        rt.left = helper(nums, lft, mid - 1);
        rt.right = helper(nums, mid + 1, rht);
        return rt;
    }
}
