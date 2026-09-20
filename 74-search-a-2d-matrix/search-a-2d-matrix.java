class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;

        int start = 0;
        int end = m*n-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid/n][mid%n] < target) start = mid+1;
            else if(arr[mid/n][mid%n] > target) end = mid-1;
            else return true;
        }
        return false;
    }
}