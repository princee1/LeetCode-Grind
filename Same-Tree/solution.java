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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return this.traverseTree(p, q);
    }

    private boolean traverseTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        boolean left = this.traverseTree(p.left, q.left);
        boolean right = this.traverseTree(p.right, q.right);

        return left && right;
    }

}