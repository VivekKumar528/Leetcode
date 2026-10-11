class Solution {
    public boolean isCycleDFS(int i, boolean[] vis, boolean[] inRecursion, ArrayList<ArrayList<Integer>> adj){
        vis[i] = true;
        inRecursion[i] = true;

        for(int ele : adj.get(i)){
            if(!vis[ele] && isCycleDFS(ele, vis, inRecursion, adj)) return true;
            else if(vis[ele] && inRecursion[ele]) return true;
        }
        inRecursion[i] = false;
        return false;
    }

    public boolean canFinish(int n, int[][] pre) {
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        
        for(int i=0;i<pre.length;i++){
            int first = pre[i][1];
            int second = pre[i][0];

            adj.get(first).add(second);
        }

        boolean[] vis = new boolean[n];
        boolean[] inRecursion = new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i] && isCycleDFS(i, vis, inRecursion, adj)) return false;
        }

        return true;
    }
}