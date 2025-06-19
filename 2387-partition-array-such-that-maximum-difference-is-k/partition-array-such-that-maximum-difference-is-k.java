class Solution {
    public int partitionArray(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        Arrays.sort(arr);
        while(j < arr.length){
            if(arr[j] - arr[i] > k) {
                i = j;
                j++;
                count++;
            } else j++;
        }
        return count+1;
    }
}