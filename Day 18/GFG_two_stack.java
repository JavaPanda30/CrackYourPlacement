// https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1


class twoStacks
{
    Stack<Integer> aman1;
    Stack<Integer> aman2;
    twoStacks()
    {
        aman1 = new Stack<>();
        aman2 = new Stack<>();
    }
    void push1(int x)
    {
        aman1.push(x);
    }
    void push2(int x)
    {
        aman2.push(x);
    }
    int pop1()
    {
        return aman1.empty()?-1:aman1.pop();
    }
    int pop2()
    {
        return aman2.empty()?-1:aman2.pop();
    }
}

