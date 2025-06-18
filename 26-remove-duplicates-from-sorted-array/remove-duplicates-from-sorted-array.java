class Solution {
    public int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int idx = 0;
        for(int ele : set){
            arr[idx] = ele;
            idx++;
        }
        Arrays.sort(arr, 0, set.size());
        return set.size();
    }
}