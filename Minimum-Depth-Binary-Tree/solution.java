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

    static int Infinity = (int) Double.POSITIVE_INFINITY;
    int minHeight = Infinity;

    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        return this.traverseTree(root, 1);
    }

    private int traverseTree(TreeNode node, int height) {
        if (node == null)
            return Infinity;

        if (height >= this.minHeight)
            return this.minHeight;

        int left = this.traverseTree(node.left, height + 1);
        int right = this.traverseTree(node.right, height + 1);

        if (left == Infinity && right == Infinity) {
            this.minHeight = Math.min(height, this.minHeight);
            return height;
        }

        return Math.min(left, right);

    }
}