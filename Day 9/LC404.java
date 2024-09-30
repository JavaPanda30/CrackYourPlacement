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
    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return ans;
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        int lft = maxdepth(root.left);
        int rght = maxdepth(root.right);
        if (lft == rght && rght == 1 || lft == 1) {
            ans += root.left.val;
        }
        helper(root.right);
    }

    public int maxdepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft = maxdepth(root.left);
        int rht = maxdepth(root.right);
        return Math.max(lft,rht)+1;
    }
}