class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int currNum = 0;
        char sign = '+';
        for (int i = 0; i < len; i++) {
            char currCh = s.charAt(i);
            if (Character.isDigit(currCh)) {
                currNum = (currNum * 10) + (currCh - '0');
            }
            if (!Character.isDigit(currCh) && !Character.isWhitespace(currCh) || i == len - 1) {
                if (sign == '-') {
                    stack.push(-currNum);
                }
                else if (sign == '+') {
                    stack.push(currNum);
                }
                else if (sign == '*') {
                    stack.push(stack.pop() * currNum);
                }
                else if (sign == '/') {
                    stack.push(stack.pop() / currNum);
                }
                sign = currCh;
                currNum = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
