/**
 * Definition for a binary tree node.
 * 
 */
class Solution {
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }
    public int maxDepth(TreeNode root) {
        return this.traverseTree(root,0);
    }

    private int traverseTree(TreeNode node, int height){
        if (node == null)
            return height;
        
        int left  = this.traverseTree(node.left,height+1);
        int right  = this.traverseTree(node.right,height+1);

        return Math.max(left,right);
    }
}