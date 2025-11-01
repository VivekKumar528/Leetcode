class Solution {
    public void helper(TreeNode root, int level, List<Integer> ans){
        if(root == null) return;
        if(ans.size() < level) ans.add(root.val);
        if(root.right != null) helper(root.right, level+1, ans);
        if(root.left != null) helper(root.left, level+1, ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, 1, ans);
        return ans;
    }
}