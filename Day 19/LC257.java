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
    List<String> ans =new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String curr = "";
        helper(ans,root,curr);
        return ans;
    }

    public void helper(List<String> ans,TreeNode root, String curr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            curr+=root.val+"";
            ans.add(curr);
            return;
        }
        helper(ans,root.left,curr+root.val+"->");
        helper(ans,root.right,curr+root.val+"->");
    }
}