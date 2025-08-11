class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int len = arr.length;
        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;
        while(j < len){
            if(Math.abs(i-j) > k) {
                set.remove(arr[i]);
                i++;
            }

            if(set.contains(arr[j])) return true;

            set.add(arr[j]);
            j++;
        }
        return false;

    }
}