class Solution {
    public int[][] generateMatrix(int n) {
        if(n == 0) return new int[][]{};

        int[][] res = new int[n][n];

        int top = 0;
        int down = n-1;
        int left = 0;
        int right = n-1;

        int dir = 0; 
        // dir == 0 -> left to right
        // dir == 1 -> top to down
        // dir == 2 -> right to left;
        // dir == 3 -> down to top
        int counter = 1;
        while(top <= down && left <= right){
            if(dir == 0){ // left to right
                for(int j=left;j<=right;j++){
                    res[top][j] = counter++;
                }
                top++;

            } else if(dir == 1){ // top to down, const - right
                for(int i=top;i<=down;i++){
                    res[i][right] = counter++;
                }
                right--;

            } else if(dir == 2){ // right to left, const - down
                for(int j=right;j>=left;j--){
                    res[down][j] = counter++;
                }
                down--;

            } else { // down to top
                for(int i=down;i>=top;i--){
                    res[i][left] = counter++;
                }
                left++;
            }
            dir++;
            if(dir > 3) dir = 0;
        }

        return res;
    }
}