class Solution {
    public void moveZeroes(int[] arr) {
        int[] ans = new int[arr.length];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
}