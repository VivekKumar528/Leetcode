class Solution {
    boolean solve(TreeNode root, int targetSum, int currSum){
        if(root == null) return false;
        currSum += root.val;
        if(root.left == null && root.right == null && currSum == targetSum) return true;
        return solve(root.left, targetSum, currSum) || solve(root.right, targetSum, currSum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum, 0);
    }
}