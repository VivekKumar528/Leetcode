class Solution {
    public int solve(TreeNode root, int currNum){
        if(root == null) return 0;
        currNum = (currNum * 10)+ root.val;
        if(root.left == null &&  root.right == null) return currNum;
        return solve(root.left, currNum) + solve(root.right, currNum);

    }
    public int sumNumbers(TreeNode root) {
        return solve(root, 0);
    }
}