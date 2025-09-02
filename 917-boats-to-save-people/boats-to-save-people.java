class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int len = arr.length;
        int i = 0;
        int j = len-1;
        int boat = 0;
        while(i <= j){
            if(arr[i] + arr[j] <= limit){
                i++;
                j--;
                boat++;
            } else {
                j--;
                boat++;
            }
        }
        return boat;
    }
}