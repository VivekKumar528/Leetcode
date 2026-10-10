class Solution {
    public void dfs(int i, boolean[] vis, int[][] mat){
        vis[i] = true;
        int n = mat.length;
        for(int col=0;col<n;col++){
            if(mat[i][col] == 1 && !vis[col]) dfs(col, vis, mat);
        }
    }
    // public void bfs(int i, boolean[] vis, List<List<Integer>> adj){
    //     vis[i] = true;
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(i);

    //     while(q.size() > 0){
    //         int front = q.remove();
    //         for(int ele : adj.get(front)){
    //             if(!vis[ele]){
    //                 q.add(ele);
    //                 vis[ele] = true;
    //             }
    //         }
    //     }
    // }
    public int findCircleNum(int[][] mat) {
        int n = mat.length;

        boolean[] vis = new boolean[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(!vis[i]) {
                // bfs(i, vis, adj);
                dfs(i, vis, mat);
                count++;
            }
        }

        return count;
    }
}