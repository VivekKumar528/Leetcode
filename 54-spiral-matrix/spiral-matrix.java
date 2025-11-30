class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new LinkedList<>();
        int dir = 0;
        int left = 0;
        int right = n-1;
        int top = 0;
        int down = m-1;
        while(ans.size() < (m*n)) {
            if(dir == 0){
                for(int j=left; j<=right; j++){
                    ans.add(arr[top][j]);
                }
                top++;
            }
            if(dir == 1){
                for(int i=top;i<=down;i++){
                    ans.add(arr[i][right]);
                }
                right--;
            }
            if(dir == 2){ // right to left
                for(int j=right;j>=left;j--){
                    ans.add(arr[down][j]);
                }
                down--;
            }
            if(dir == 3){ // down to top
                for(int i=down;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
            dir++;
            if(dir == 4) dir = 0;
        }
        return ans;
    }
}