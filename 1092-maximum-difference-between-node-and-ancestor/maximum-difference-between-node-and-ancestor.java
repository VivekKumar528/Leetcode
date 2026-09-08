class Solution {
    int diff = 0;

    void traversal(TreeNode root, int min, int max) {
        if (root == null) return;
        diff = Math.max(diff, Math.max(Math.abs(root.val - min), Math.abs(root.val - max)));
        traversal(root.left, Math.min(root.val, min), Math.max(root.val, max));
        traversal(root.right, Math.min(root.val, min), Math.max (root.val, max));
    }

    public int maxAncestorDiff(TreeNode root) {
        traversal(root, root.val, root.val);
        return diff;
    }
}
