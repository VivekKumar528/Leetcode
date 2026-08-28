class Solution {
    public boolean validBox(char[][] board, int sr, int er, int sc, int ec){
        HashSet<Character> set = new HashSet<>();
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(set.contains(ch)) return false;
                set.add(ch);

            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = m;
        for(int i=0;i<9;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(set.contains(ch)) return false;
                set.add(ch);
            }
        }

        for(int j=0;j<9;j++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<9;i++){
                char ch = board[i][j];
                if(ch == '.') continue;
                if(set.contains(ch)) return false;
                set.add(ch);
            }
        }

        for(int sr=0;sr<9;sr+=3){
            int er = sr + 2;
            
            for(int sc=0;sc<9;sc+=3){
                int ec = sc + 2;
                if(!validBox(board, sr, er, sc, ec)) return false;
            }
        }


        return true;
    }
}