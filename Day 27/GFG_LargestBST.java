
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    static class SubtreeInfo {
        boolean isBST;
        int size;
        int min;
        int max;

        SubtreeInfo(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        return largestBstUtil(root).size;
    }
        // Write your code here
    
    // Utility function to return SubtreeInfo for each node
    private static SubtreeInfo largestBstUtil(Node root) {
        // An empty tree is a BST of size 0
        if (root == null) {
            return new SubtreeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        // Get information from left and right subtrees
        SubtreeInfo left = largestBstUtil(root.left);
        SubtreeInfo right = largestBstUtil(root.right);
        // Check if the current node forms a BST
        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            // The current subtree is also a BST
            int size = left.size + right.size + 1;
            int min = Math.min(root.data, left.min);
            int max = Math.max(root.data, right.max);
            return new SubtreeInfo(true, size, min, max);
        }
        // Otherwise, it's not a BST. Return the size of the largest BST found so far
        return new SubtreeInfo(false, Math.max(left.size, right.size), 0, 0);
    }
}