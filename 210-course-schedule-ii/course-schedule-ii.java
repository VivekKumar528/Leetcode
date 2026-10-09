class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());

        int[] indegree = new int[n];
        for(int i=0;i<pre.length;i++){
            int first = pre[i][1];
            int second = pre[i][0];

            adj.get(first).add(second);
            indegree[second]++;
        }
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if (indegree[i] == 0) q.add(i);
        }
        while(q.size() > 0){
            int front = q.remove();
            res.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele] == 0) q.add(ele);
            }
        }

        if(res.size() != n) return new int[]{};
        int[] ans = new int[res.size()];
        int idx = 0;
        for(int ele : res) ans[idx] = res.get(idx++);
        return ans;

    }
}