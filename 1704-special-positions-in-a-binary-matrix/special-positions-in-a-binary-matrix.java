class Solution {
    public int numSpecial(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[] rowTrack = new int[m];
        int[] colTrack = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1) {
                    rowTrack[i] += 1;
                    colTrack[j] += 1;
                }
            }
        }
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == 1 && rowTrack[i] == 1 && colTrack[j] == 1) res += 1;
            }
        }

        return res;
    }
}