class Solution {

    public static boolean find(char[][] board, int i, int j, int idx, String word, int[][] dir){
        int m = board.length;
        int n = board[0].length;
        if(idx == word.length()) return true;

        if(i < 0 || j < 0 || i >= m || j >= n) return false;
        if(board[i][j] != word.charAt(idx)) return false;

        char temp = board[i][j];
        board[i][j] = '$';

        for(int[] d : dir){
            int newI = i + d[0];
            int newJ = j + d[1];

            if(find(board, newI, newJ, idx+1, word, dir)) return true;
        }
        board[i][j] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0) && find(board, i, j, 0, word, dir)) return true;
            }
        }
        return false;
    }
}