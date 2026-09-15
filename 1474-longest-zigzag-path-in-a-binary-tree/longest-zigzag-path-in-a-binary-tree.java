class Solution {

    int maxPath = 0;
    public void solve(TreeNode root, int steps, boolean goLeft){
        if(root == null) return;
        maxPath = Math.max(steps, maxPath);
        if(goLeft == true){
            solve(root.left, steps+1, false);
            solve(root.right, 1, true);
        } else { // goRight
            solve(root.right, steps+1, true);
            solve(root.left, 1, false);
        }
    }
    public int longestZigZag(TreeNode root) {
        
        solve(root, 0, true);
        solve(root, 0, false);

        return maxPath;
    }
}