class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int len = arr.length;
        int i = 0;
        int j = len-1;
        int count = 0;
        while(i <= j){
            if(arr[i] + arr[j] <= limit){
                i++;
                j--;
                count++;
            } else {
                if(arr[i] > arr[j]) i++;
                else j--;
                count++;
            }
        }
        return count;
    }
}