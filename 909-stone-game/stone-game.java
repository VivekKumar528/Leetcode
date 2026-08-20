class Solution {
    int[][] memo = new int[501][501];
    int solve(int i, int j, int[] piles){
        if(i > j) return 0;
        if(memo[i][j] != 0) return memo[i][j];
        int take_i = piles[i] + Math.min(solve(i+2, j, piles), solve(i+1, j-1, piles));
        int take_j = piles[j] + Math.min(solve(i, j-2, piles), solve(i+1, j-1, piles));

        return memo[i][j] = Math.max(take_i, take_j);
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;

        int sum = 0;
        for(int ele : piles) sum += ele;

        int aliceScore = solve(0, n-1, piles);

        return aliceScore > (sum/2);
    }
}