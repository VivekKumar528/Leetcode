class Solution {
    List<List<String>> result = new ArrayList<>();
    int N;

    boolean isValid(List<List<String>> board, int row, int col){

        // Look upward
        for(int i=row-1;i>=0;i--) if(board.get(i).get(col).equals("Q")) return false;

        // Check diagonally left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--) if(board.get(i).get(j).equals("Q")) return false;

        // Check diagonally right
        for(int i=row-1, j=col+1; i>=0 && j<N; i--,j++) if(board.get(i).get(j).equals("Q")) return false;

        return true;

    }

    void solve(List<List<String>> board, int row){
        if(row >= N){
            List<String> copy = new ArrayList<>();
            for(int i=0;i<N;i++){
                String rowStr = "";
                for(int j=0;j<N;j++){
                    rowStr += board.get(i).get(j);
                }
                copy.add(rowStr);
            }
            result.add(copy);
            return;
        }

        for(int col=0;col<N;col++){
            if(isValid(board, row, col)){
                board.get(row).set(col, "Q");

                solve(board, row+1);

                board.get(row).set(col, ".");

            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        N = n;
        List<List<String>> board = new ArrayList<>();
        for(int i=0;i<N;i++){
            List<String> temp = new ArrayList<>();
            for(int j=0;j<N;j++) temp.add(".");
            board.add(temp);
        }
        solve(board, 0);
        return result;
    }
}