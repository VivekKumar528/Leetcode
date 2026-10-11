class Solution {
    public boolean topologicalSort(List<List<Integer>> adj, int n, int[] indegree){
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0) {
                q.add(i);
                count++;
            }
        }

        while(q.size() > 0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele] == 0){
                    q.add(ele);
                    count++;
                }
            }
        }
        return count == n;
    }
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj = new LinkedList<>();
        for(int i=0;i<n;i++) adj.add(new LinkedList<>());
        int[] indegree = new int[n];
        for(int i=0;i<pre.length;i++){
            int a = pre[i][0];
            int b = pre[i][1];
            indegree[b]++;
            adj.get(a).add(b);
        }

        return topologicalSort(adj, n, indegree);

        // return count == n;


    }
}