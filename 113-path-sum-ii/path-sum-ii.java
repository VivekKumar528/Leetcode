/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> ans = new LinkedList<>();

    public void helper(TreeNode root, List<Integer> tempList, int sum, int targetSum) {
        if (root == null)
            return;
        sum += root.val;
        tempList.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                ans.add(new ArrayList<>(tempList));
            }
            tempList.remove(tempList.size() - 1);
            return;
        }
        helper(root.left, tempList, sum, targetSum);
        helper(root.right, tempList, sum, targetSum);
        tempList.remove(tempList.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list = new LinkedList<>();
        helper(root, list, 0, targetSum);
        return ans;
    }
}