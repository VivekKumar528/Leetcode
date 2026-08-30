class Solution {
    public int countNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public boolean traversal(TreeNode root, int i, int totalNodes){
        if(root == null) return true;
        if(i > totalNodes) return false;
        return traversal(root.left, 2*i, totalNodes) && traversal(root.right, 2*i+1, totalNodes);
    }
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);
        int i = 1;
        return traversal(root, i, totalNodes);
    }
}