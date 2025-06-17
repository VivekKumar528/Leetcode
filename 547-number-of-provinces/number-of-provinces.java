class Solution {
    public void DFS(Map<Integer, List<Integer>> map, int u, boolean[] vis){
        vis[u] = true;
        for(int v : map.get(u)){
            if(!vis[v]){
                DFS(map,v,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = isConnected.length;
        int m = isConnected[0].length;
        for(int i=1;i<=n;i++) map.put(i, new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j && isConnected[i][j] == 1){
                    map.get(i+1).add(j+1);
                }
            }
        }
        boolean[] vis = new boolean[n+1];
        int count = 0;
        for(int i=1;i<=n;i++){
            if(!vis[i]) {
                DFS(map, i, vis);
                count++;
                
            }
        }

        System.out.println(map);
        return count;

    }
}