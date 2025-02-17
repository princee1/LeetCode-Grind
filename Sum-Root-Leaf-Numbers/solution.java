/**
 * Definition for a binary tree node.
 *
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        return this.traverseTree(root, 0);
    }

    private int traverseTree(TreeNode node, int parentVal) {
        if (node == null)
            return 0;
        int val = node.val + parentVal * 10;
        int left = this.traverseTree(node.left, val);
        int right = this.traverseTree(node.right, val);
        int result = 0;
        if (left == 0 && right == 0)
            result += val;

        result += left + right;
        return result;
    }
}