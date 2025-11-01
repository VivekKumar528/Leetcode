class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean seenNull = false;
        while (!q.isEmpty()) {
            TreeNode front = q.poll();
            if (front == null) {
                seenNull = true;
            } else {
                if (seenNull == true)
                    return false;

                q.offer(front.left);

                q.offer(front.right);
            }

        }
        return true;
    }
}