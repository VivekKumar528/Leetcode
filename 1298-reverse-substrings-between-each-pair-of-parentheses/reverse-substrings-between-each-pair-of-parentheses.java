class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> lastSkipLength = new Stack<>();

        String result = "";

        for(char ch : s.toCharArray()){
            if(ch == '(') lastSkipLength.add(result.length());
            else if(ch == ')'){
                int l = lastSkipLength.pop();
                String part = result.substring(l);

                result = result.substring(0, l) + new StringBuilder(part).reverse().toString();

            } else result += ch;
        }
        return result;
    }
}