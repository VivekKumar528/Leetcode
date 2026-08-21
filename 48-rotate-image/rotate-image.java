class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix[0].length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int x=0;x<len;x++){
            int i = 0;
            int j = len-1;
            while(i < j){
                int temp = matrix[x][i];
                matrix[x][i] = matrix[x][j];
                matrix[x][j] = temp;
                i++;
                j--;
            }
        }
    }
}