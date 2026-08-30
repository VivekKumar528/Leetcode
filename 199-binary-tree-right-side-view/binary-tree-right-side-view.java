class Solution {
    void preOrder(TreeNode root, int level, List<Integer> result){
        if(root == null) return;
        if(result.size() < level) result.add(root.val);
        preOrder(root.right, level+1, result);
        preOrder(root.left, level+1, result);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, 1, result);
        return result;
    }
}