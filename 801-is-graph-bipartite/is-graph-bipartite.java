class Solution {
    public boolean bfs(int currNode, int[] color, int[][] adj, int currColor){
        color[currNode] = currColor;
        Queue<Integer> q = new LinkedList<>();
        q.add(currNode);

        while(q.size() != 0){
            int front = q.remove();

           

            for(int ele : adj[front]){
                if(color[ele] == color[front]) return false;
                else { 
                    if(color[ele] == -1){
                        int eleColor = 1-color[front];
                        color[ele] = eleColor;
                        q.add(ele);
                    }
                }
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] adj) {
        int V = adj.length;
        int[] color = new int[V];
        Arrays.fill(color, -1); // 1->red, 0->green, -1->unvisited

        for(int i=0;i<V;i++){
            if(color[i] == -1 && !bfs(i, color, adj, 1)) return false ;
        }

        return true;
    }
}