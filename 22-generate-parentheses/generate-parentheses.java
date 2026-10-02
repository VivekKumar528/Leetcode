class Solution {
    public boolean isValid(StringBuilder sb){
        int res = 0;
        for(char ch : sb.toString().toCharArray()){
            if(ch == '(') res++;
            else {
                res--;
                if(res < 0) return false;
            }
        }

        return res == 0;
    }
    public void solve(StringBuilder curr, List<String> res, int n){
        if(curr.length() == 2*n){
            if(isValid(curr)) res.add(curr.toString());
            return;
        }

        curr.append("(");
        solve(curr, res, n);
        curr.deleteCharAt(curr.length()-1);
        curr.append(")");
        solve(curr, res, n);
        curr.deleteCharAt(curr.length()-1);


    }
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        solve(new StringBuilder(), res, n);
        return res;

    }
}