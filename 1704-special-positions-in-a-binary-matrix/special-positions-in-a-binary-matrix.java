class Solution {
    public boolean checkRow(int row, int[][] arr){
        int count = 0;
        for(int j=0;j<arr[0].length;j++){
            if(arr[row][j] == 1) count++;
        }
        return count == 1;
    }
    public boolean checkCol(int col, int[][] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col] == 1) count++;
        }
        return count == 1;
    }
    public int numSpecial(int[][] arr) {
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    if(checkRow(i, arr) && checkCol(j, arr)) ans = ans + 1;
                }
            }
        }
        return ans;
    }
}