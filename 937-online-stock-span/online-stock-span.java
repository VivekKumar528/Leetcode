class StockSpanner {
    class Pair {
        int p;
        int span;

        Pair(int price, int span) {
            p = price;
            this.span = span;
        }
    }

    public StockSpanner() {

    }

    Stack<Pair> st = new Stack<>();

    public int next(int price) {
        int span = 1;

        while (!st.isEmpty() && st.peek().p <= price) {
            span += st.pop().span;
        }
        st.push(new Pair(price, span));
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */