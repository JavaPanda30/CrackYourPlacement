/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root,1);
    }
    int helper(TreeNode root, int depth){
        if(root==null){
            return 0;
        }
        int left=0,right=0;
        left = helper(root.left,depth);
        right = helper(root.right,depth);
        return depth+Math.max(left,right);
    }
}