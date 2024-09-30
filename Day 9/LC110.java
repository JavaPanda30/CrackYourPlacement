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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lft = 0;
        int rght = 0;
        if (root.left != null) {
            lft = maxHeight(root.left);
        }
        if (root.right != null) {
            rght = maxHeight(root.right);
        }
        return Math.abs(lft - rght) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int maxHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lft = maxHeight(root.left);
        int rght = maxHeight(root.right);
        return Math.max(lft, rght) + 1;
    }
}