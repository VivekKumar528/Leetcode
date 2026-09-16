class Pair{
    TreeNode root;
    int idx;
    Pair(TreeNode root, int idx){
        this.root = root;
        this.idx = idx;
    }
}

class Solution {
    public int levelOrderTraversal(TreeNode root, int idx){
        Deque<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, idx));

        int maxWidth = 0;
        while(!q.isEmpty()){
            // Pair p = q.poll(); // {node, idx};
            // TreeNode front = p.root;
            // int currIdx = p.idx;
            int L = q.peekFirst().idx;
            int R = q.peekLast().idx;

            maxWidth = Math.max(maxWidth, R-L+1);
            int n = q.size();

            while(n-->0){
                TreeNode curr = q.peekFirst().root;
                int currIdx = q.peekFirst().idx;

                q.poll();

                if(curr.left != null) q.offer(new Pair(curr.left, (2*currIdx + 1)));

                if(curr.right != null) q.offer(new Pair(curr.right, (2*currIdx+2)));
            }

        }
        return maxWidth;
    }
    public int widthOfBinaryTree(TreeNode root) {
        return levelOrderTraversal(root, 0);
    }
}