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
    List<List<Integer>> fn = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> ans =new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null)
        return fn ;
        que.offer(root);
        while(!que.isEmpty()){
            int level = que.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for(int i=0;i<level;i++){
                if(que.peek().left!=null)
                que.offer(que.peek().left);
                if(que.peek().right!=null)
                que.offer(que.peek().right);
                sublist.add((int)que.poll().val);
            }
            fn.add(sublist);
        }
        return fn;
    }
}