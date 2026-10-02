class Solution {
    public void solve(StringBuilder curr, List<String> res, int n, int open, int close) {
        if (curr.length() == 2 * n) {
            res.add(curr.toString());
            return;
        }

        if (open < n) {
            curr.append("(");
            solve(curr, res, n, open+1, close);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close < open) {
            curr.append(")");
            solve(curr, res, n, open, close+1);
            curr.deleteCharAt(curr.length() - 1);
        }

    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int open = 0;
        int close = 0;
        solve(new StringBuilder(), res, n, open, close);
        return res;

    }
}