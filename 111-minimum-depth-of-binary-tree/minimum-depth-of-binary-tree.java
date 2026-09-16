class Solution {
    public int bfs(TreeNode root, int level) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return level;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                TreeNode temp = q.poll();
                if (temp.left == null && temp.right == null)
                return level;
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            level++;
        }
        return -1;

    }

    public int minDepth(TreeNode root) {
        return bfs(root, 1);
    }
}