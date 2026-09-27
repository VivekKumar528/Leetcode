class Solution {
    public int operate(int num1, int num2, String operator) {
        int result = 0;
        result = operator.equals("+") ? num1 + num2
                : operator.equals("-") ? num1 - num2
                        : operator.equals("*") ? num1 * num2 : operator.equals("/") ? num1 / num2 : -1;

        return result;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int num2 = Integer.valueOf(st.pop());
                int num1 = Integer.valueOf(st.pop());

                int result = operate(num1, num2, token);

                st.push(result);
            } else
                st.push(Integer.valueOf(token));
        }

        return st.peek();
    }
}