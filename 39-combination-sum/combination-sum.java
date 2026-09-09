class Solution {
    Set<List<Integer>> set = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();
    public void solve(int[] arr, int i, List<Integer>list, int target){
        if( i >= arr.length || target < 0) return;
        if(target == 0 && !set.contains(list)){
            result.add(new ArrayList<>(list));
            set.add(list);
            return;
        }
        list.add(arr[i]);
        solve(arr, i+1, list, target - arr[i]);
        solve(arr, i, list, target - arr[i]);
        list.remove(list.size() - 1);
        solve(arr, i+1, list, target);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        solve(arr, 0, new ArrayList<>(), target);

        return result;
    }
}