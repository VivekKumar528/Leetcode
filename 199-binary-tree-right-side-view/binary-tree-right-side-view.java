class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode front = null;
            int size = q.size();
            while(size --> 0){
                front = q.poll();
                if(front.left != null) q.offer(front.left);
                if(front.right != null) q.offer(front.right);
            }
            ans.add(front.val);
        }
        return ans;
    }
}