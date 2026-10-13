class Solution {
    public void bfs(int i, boolean[] vis, List<List<Integer>> adj){
        vis[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(q.size() > 0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(!vis[ele]) {
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int n = arr.length;

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!vis[i]) {
                bfs(i, vis, adj);
                count++;
            }    
        }

        return count;

    }
}