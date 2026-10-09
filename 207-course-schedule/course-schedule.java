class Solution {
    public void kahnAlgo(int n, int[] inDegreeCount, List<List<Integer>> adj, List<Integer> res){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++) if(inDegreeCount[i] == 0) q.add(i);

        while(q.size() > 0){
            int front = q.remove();
            res.add(front);
            for(int ele : adj.get(front)){
                inDegreeCount[ele]--;
                if(inDegreeCount[ele] == 0) q.add(ele);
            }
        }

    }
    public boolean canFinish(int n, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<Integer>());
        int[] inDegreeCount = new int[n];
        for(int i=0;i<pre.length;i++){
            int second = pre[i][0];
            int first = pre[i][1];
            adj.get(first).add(second);
            inDegreeCount[second]++;
        }
        List<Integer> res = new ArrayList<>();
        kahnAlgo(n, inDegreeCount, adj, res);
        return res.size() == n;
    }
}