class Solution {
    public int[] findOrder(int n, int[][] pre) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        int[] indegree = new int[n];
        for(int i=0;i<pre.length;i++){
            int first = pre[i][0];
            int second = pre[i][1];
            adj.get(second).add(first);
            indegree[first]++;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i=0;i<indegree.length;i++) if(indegree[i] == 0) {
            q.add(i);
            temp.add(i);
            count++;
        }

        while(q.size() > 0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele] == 0) {
                    q.add(ele);
                    temp.add(ele);
                    count++;
                }
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        for(int ele : temp) ans[idx++] = ele;
        if(count == n) return ans;
        return new int[]{};
    }
}