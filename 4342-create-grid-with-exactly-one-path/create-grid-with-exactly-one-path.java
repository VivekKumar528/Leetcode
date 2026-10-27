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
            StringBuilder res = new StringBuilder();
            for(int j=0;j<n;j++){
                res.append(temp[i][j]);
            }
            ans[i] = res.toString();
        }

        return ans;

    }
}