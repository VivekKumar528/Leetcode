class Solution {
    public void solve(int idx, List<Integer> temp, List<List<Integer>> ans, int[] arr, int n){
        if(idx == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[idx]);
        solve(idx+1, temp, ans, arr, n);
        temp.remove(temp.size() - 1);
        solve(idx+1, temp, ans, arr, n);


    }
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int n = arr.length;
        solve(0, temp, ans,arr, n);
        return ans;
    }
}