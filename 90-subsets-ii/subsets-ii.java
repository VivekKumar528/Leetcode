    class Solution {
        public void solve(int idx, int[] arr, List<Integer> temp, List<List<Integer>> ans){
             ans.add(new ArrayList<>(temp));
             
            for(int i=idx; i<arr.length; i++){
                if(i > idx && arr[i] == arr[i - 1]) continue;
                temp.add(arr[i]);
                solve(i+1, arr, temp, ans);
                temp.remove(temp.size() - 1);
            }

        }
        public List<List<Integer>> subsetsWithDup(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> temp =  new ArrayList<>();
            solve(0, arr, temp, ans);
            return ans;
        }
    }