class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int r1 = startPos[0];
        int c1 = startPos[1];

        int r2 = homePos[0];
        int c2 = homePos[1];
        int result = 0;

        // moving in rows
        if(r2 >= r1) {
            // moving down
            for(int r=r1+1;r<=r2;r++){
                result += rowCosts[r];
            }
        } else {
            // Moving up
            for(int r=r1-1;r>=r2;r--){
                result += rowCosts[r];
            }
        }

        // moving in cols
        if(c2 >= c1) {
            // moving right
            for(int c=c1+1;c<=c2;c++){
                result += colCosts[c];
            }
        } else {
            // Moving left
            for(int c=c1-1;c>=c2;c--){
                result += colCosts[c];
            }
        }
        return result;
    }
}