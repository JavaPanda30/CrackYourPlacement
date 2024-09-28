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
    int maxLength = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return maxLength;
    }
    int helper(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        maxLength = Math.max(left + right + 2, maxLength);
        return Math.max(left, right) + 1;
    }
}