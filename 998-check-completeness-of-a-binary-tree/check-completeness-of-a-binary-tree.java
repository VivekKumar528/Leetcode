class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean seenNullNode = false;
        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                seenNullNode = true;
            } else {
                if (seenNullNode == true)
                    return false;

                q.offer(node.left);
                q.offer(node.right);
            }

        }
        return true;
    }
}