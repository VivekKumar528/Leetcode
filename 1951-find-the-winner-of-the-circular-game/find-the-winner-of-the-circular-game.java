class Solution {
    public int helper(ArrayList<Integer> list, int k, int idx){
        if(list.size() == 1) return list.get(0);
        idx = (idx + (k-1)) % list.size();
        list.remove(idx);
        return helper(list, k, idx);
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        return helper(list, k , 0);

    }
}