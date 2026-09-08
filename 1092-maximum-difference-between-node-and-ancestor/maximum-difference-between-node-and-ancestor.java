
class Solution {
    int maxDiff = Integer.MIN_VALUE;
    void findMaxDiff(TreeNode root, TreeNode child){
        if(root == null || child == null) return;
        maxDiff = Math.max(maxDiff, Math.abs(root.val - child.val));

        findMaxDiff(root, child.left);
        findMaxDiff(root, child.right);
    }

    void treeIterator(TreeNode root){
        if(root == null) return;

        findMaxDiff(root, root.left);
        findMaxDiff(root, root.right);

        treeIterator(root.left);
        treeIterator(root.right);
    }
    public int maxAncestorDiff(TreeNode root) {
        treeIterator(root);

        return maxDiff;
    }
}