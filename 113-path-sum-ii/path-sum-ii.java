class Solution {
    List<List<Integer>> result = new ArrayList<>();

    void fill(TreeNode root, int sum, List<Integer> temp, int targetSum){
        if(root == null) return;

        sum += root.val;
        temp.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == targetSum) result.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
            return;
        }
        fill(root.left, sum, temp, targetSum);
        fill(root.right, sum, temp, targetSum);
        temp.remove(temp.size() - 1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum = 0;

        List<Integer> temp = new ArrayList<>();
        fill(root, sum, temp, targetSum);

        return result;
    }
}