class Solution {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @SuppressWarnings("unused")
        TreeNode() {
        }

        @SuppressWarnings("unused")
        TreeNode(int val) {
            this.val = val;
        }

        @SuppressWarnings("unused")
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return this.traverseTree(root.left,root.right);
    }

    private boolean traverseTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        boolean left = this.traverseTree(p.left, q.right);
        boolean right = this.traverseTree(p.right, q.left);

        return left && right;
    }
}