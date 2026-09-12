class Solution {
    boolean check(int[][] arr, int row, int col){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col] == 1) count++;
            if(count >= 2) return false;
        }
        count = 0;
        for(int j=0;j<arr[0].length;j++){
            if(arr[row][j] == 1) count++;
            if(count >= 2) return false;
        }
        return true;
    }
    public int numSpecial(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1 && check(arr, i, j)) res++;
            }
        }

        return res;
    }
}