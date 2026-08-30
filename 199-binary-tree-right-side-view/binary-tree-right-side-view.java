class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(q.size() != 0){
            int n = q.size();

            TreeNode node = null;
            while(n --> 0){
                node = q.poll();
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            result.add(node.val);
        }
        return result;
    }
}