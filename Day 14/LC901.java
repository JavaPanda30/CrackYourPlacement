class Pair {
    int price;
    int span;

    public Pair(int e, int c) {
        price = e;
        span = c;
    }
}

class StockSpanner {
    Stack<Pair> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek().price <= price) {
            span += st.peek().span;
            st.pop();
        }
        st.push(new Pair(price, span));
        return span;
    }
}
