class Solution {
    public void dfs(int row, boolean[] vis, int[][] adj){
        int n = adj.length;
        vis[row] = true;
        for(int j=0;j<n;j++){
            if(adj[row][j] == 1 && vis[j] == false){
                dfs(j, vis, adj);
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]) {
                dfs(i, vis, adj);
                count++;
            }
        }
        return count;
    }
}