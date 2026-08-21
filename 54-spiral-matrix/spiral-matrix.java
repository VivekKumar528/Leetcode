class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int dir = 0;
        int top = 0;
        int down = m-1;
        int left = 0;
        int right = n-1;
        /*
            dir = 0 => left to right
            dir = 1 => top to down
            dir = 2 => right to left
            dir = 3 => down to top
        */

        List<Integer> result = new ArrayList<>();

        while(top <= down && left <= right){
            if(dir == 0){
                // left to right
                // constant : row (top)
                for(int j=left; j<=right;j++){
                    result.add(matrix[top][j]);
                }
                top++;
            }

            if(dir == 1){
                // up to down
                // constant : col (right)
                for(int i=top;i<=down;i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }

            if(dir == 2){
                // right to left
                // constant : row (down)
                for(int j=right;j>=left;j--){
                    result.add(matrix[down][j]);
                }
                down--;
            }
            if(dir == 3){
                // down to top
                // constant : col (left)
                for(int i=down;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
            dir++;
            if(dir == 4) dir = 0;
        }
        return result;
    }
}