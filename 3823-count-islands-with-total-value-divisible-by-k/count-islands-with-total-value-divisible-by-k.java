class Solution {
    public long dfs(int i, int j, int k, int[][] arr){
        int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        long sum = arr[i][j];
        arr[i][j] = 0;
        for(int[] dir : directions){
            int i_ = i + dir[0];
            int j_ = j + dir[1];
            if(i_ >= 0 && i_ < arr.length && j_ >= 0 && j_ < arr[0].length && arr[i_][j_] > 0){
                sum += dfs(i_, j_, k, arr);
            }
        }
        return sum;

    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0){
                    long sum = dfs(i, j, k, grid);
                    if(sum % k == 0) count++;
                }
            }
        }

        return count;
    }
}