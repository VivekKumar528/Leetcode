class Solution {
    public void dfs(int[][] stones, int index, boolean[] vis){
        vis[index] = true;

        for(int i=0;i<stones.length;i++){
            int row = stones[index][0];
            int col = stones[index][1];

            if((vis[i] == false) && (stones[i][0] == row || stones[i][1] == col)) dfs(stones, i, vis);
        }
    }
    public int removeStones(int[][] stones) {
        int n = stones.length;

        boolean[] vis = new boolean[n];

        int group = 0;

        for(int i=0;i<n;i++){
            if(vis[i]) continue;

            dfs(stones, i, vis);
            group++; 
        }

        return n - group;
    }
}