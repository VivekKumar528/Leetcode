class Solution {
    public int countNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public boolean dfs(TreeNode root, int idx, int totalNodes){
        if(root == null) return true;

        if(idx > totalNodes) return false;

        return dfs(root.left, 2*idx, totalNodes) && dfs(root.right, (2*idx + 1), totalNodes);
    }
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = countNodes(root);

        int i = 1;
        return dfs(root, i, totalNodes);
    }
}