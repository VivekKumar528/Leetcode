class Solution {
    public String[] createGrid(int m, int n) {
        String[][] temp = new String[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i == 0 || j == n-1) temp[i][j] = ".";
                else temp[i][j] = "#";
            }
        }
        String[] ans = new String[m];
        for(int i=0;i<m;i++){
            String res = new String();
            for(int j=0;j<n;j++){
                res += temp[i][j];
            }
            ans[i] = res;
        }

        return ans;

    }
}