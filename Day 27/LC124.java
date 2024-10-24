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
    int m=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {       
        helper(root);
        return m;
    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft = helper(root.left);        
        int rght = helper(root.right);
        if(lft<0)lft=0;
        if(rght<0)rght=0;
        m = Math.max(m,lft+rght+root.val);
        return root.val + Math.max(lft,rght);
    }
}