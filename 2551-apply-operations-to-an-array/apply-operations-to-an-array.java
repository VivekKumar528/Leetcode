class Solution {
    public int[] applyOperations(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            if(arr[i] == arr[i+1]){
                arr[i] *= 2;
                arr[i+1] = 0;
            }
        }
        int[] ans = new int[len];
        int idx = 0;
        for(int i=0;i<len;i++){
            if(arr[i] != 0){
                ans[idx] = arr[i];
                idx++;
            }   
        }
        return ans;
    }
}