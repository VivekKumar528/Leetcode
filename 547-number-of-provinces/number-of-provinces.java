class Solution {
    public void bfs(int start, int[][] adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while(q.size() > 0){
            int front = q.remove();
            for(int j=0;j<adj.length;j++){
                if(adj[front][j] == 1 && !vis[j]){
                    q.add(j);
                    vis[j] = true;
                }                
            }
        }

    }
    public int findCircleNum(int[][] adj) {
        int len = adj[0].length;
        boolean[] vis = new boolean[len];
        int count = 0;
        for(int i=0;i<len;i++){
            if(!vis[i]) {
                bfs(i, adj, vis);
                count++;
            }
        }
        return count;
    }
}