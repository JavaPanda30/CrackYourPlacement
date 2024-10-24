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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    helper(root,0);
    return ans;    
    }

    public void helper(TreeNode root , int lvl){
      if(root==null){
          return;
      }
      if(ans.size()<=lvl){
          var newlvl = new LinkedList<Integer>();
          ans.add(newlvl);
      }
      List<Integer> sublist = ans.get(lvl);
      if(lvl%2==0){
          sublist.add(root.val);
      }
      else{
          sublist.add(0,root.val);
      }
      helper(root.left,lvl+1);
      helper(root.right,lvl+1);
    }
}