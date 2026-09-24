class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int count = 1;
        int i = 0;

        while(i < len && k > 0){
            if(arr[i] == count) i++;
            else k--;

            count++;
        }
        while(k --> 0) count++;
        return count-1;
    }
}