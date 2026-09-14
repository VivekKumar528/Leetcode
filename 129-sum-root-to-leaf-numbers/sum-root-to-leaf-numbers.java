class Solution {
    public void solve(TreeNode root, List<StringBuilder> list, StringBuilder str){
        if(root == null) return;
        if(root.left == null && root.right == null){
            list.add(new StringBuilder(str).append(root.val));
            return;
        }
        solve(root.left, list, new StringBuilder(str).append(root.val));
        solve(root.right, list, new StringBuilder(str).append(root.val));
    }
    public int sumNumbers(TreeNode root) {
      List<StringBuilder> list = new LinkedList<>();
      solve(root, list, new StringBuilder());
      long sum = 0;
      for(StringBuilder str : list){
        long num = Integer.parseInt(str.toString());
        sum += num;
      }
      return (int)sum;
    }
}