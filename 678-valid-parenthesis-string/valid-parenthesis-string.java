class Solution {
    Boolean[][] t = new Boolean[101][101];
    public boolean solve(int idx, int open, String str, int n){
        if(idx == n) {
            return open == 0;
        }
        if(t[idx][open] != null) return t[idx][open];
        boolean isValid = false;
        if(str.charAt(idx) == '*'){
            isValid |= solve(idx+1, open+1, str, n);
            isValid |= solve(idx+1, open, str, n);

            if(open > 0){
                isValid |= solve(idx+1, open-1, str, n);
            }
        } else if(str.charAt(idx) == '('){
            isValid |= solve(idx+1, open+1, str, n);
        } else if(open > 0){
            isValid |= solve(idx+1, open-1, str, n);
        }

        return t[idx][open] = isValid;
    }
    public boolean checkValidString(String s) {
        int len = s.length();
        return solve(0, 0, s, len);
    }
}