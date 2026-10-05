class Solution {
    public void solveByDFS(int start, int end, boolean[] vis, List<List<Integer>> adj){
        vis[start] = true;
        for(int ele : adj.get(start)){
            if(!vis[ele])solveByDFS(ele, end, vis, adj);
        }
    }
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int first = edges[i][0];
            int second = edges[i][1];

            adj.get(first).add(second);
            adj.get(second).add(first);
        }
        boolean[] vis = new boolean[n];
        solveByDFS(start, end, vis, adj);
        return vis[end];
    }
}