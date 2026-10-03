class Solution {
    public void bfs(int start, int end, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        while (!q.isEmpty()) {
            int front = q.remove();
            List<Integer> toTraverse = adj.get(front);
            for (int ele : toTraverse) {
                if (!vis[ele]) {
                    q.add(ele);
                    vis[ele] = true;
                    if(ele == end) return;
                }
            }

        }
    }

    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end)
            return true;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int first = edges[i][0];
            int second = edges[i][1];

            adj.get(first).add(second);
            adj.get(second).add(first);
        }
        boolean[] vis = new boolean[n];
        bfs(start, end, adj, vis);
        return vis[end];
    }
}