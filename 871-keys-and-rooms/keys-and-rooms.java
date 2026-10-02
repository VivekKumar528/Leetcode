class Solution {
    public void bfs(int start, boolean[] vis, List<List<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size() > 0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(!vis[ele]){
                    vis[ele] = true;
                    q.add(ele);
                }
            }

        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int len = adj.size();
        boolean[] vis = new boolean[len];
        vis[0] = true;

        bfs(0, vis, adj);
        for(boolean x : vis) {
            if(x == false) return false;
        }

        return true;

    }
}