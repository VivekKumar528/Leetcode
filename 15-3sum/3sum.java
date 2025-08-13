class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        if(arr.length < 3) return ans;
        for (int x = 0; x < arr.length; x++) {
            if(x > 0 && arr[x] == arr[x-1]) continue;
            int target = -arr[x];
            int i = x+1;
            int j = arr.length - 1;
            while (i < j) {
                if (arr[i] + arr[j] > target)
                    j--;
                else if (arr[i] + arr[j] < target)
                    i++;
                else {
                    while(i < j && arr[i] == arr[i+1]) i++;
                    while(i < j && arr[j] == arr[j-1]) j--;
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[x]);
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    ans.add(temp);
                    i++;
                    j--;
                }
            }

        }
        return ans;
    }
}