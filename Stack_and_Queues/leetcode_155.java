//stack1 is for maintaining the minimum element and stack3 is for maintaing the actual stack;
import java.util.Stack;

class MinStack {
    Stack<Integer> stack1;// declaring the stack
    Stack<Integer> stack3;// declaring the stack

    public MinStack() {
        stack1 = new Stack<>();// defining the stack
        stack3 = new Stack<>();// defining the stack
    }

    public void push(int val)
    {
        if (stack1.isEmpty() || val<=stack1.peek())
        {
            stack1.push(val);
        }
        stack3.push(val);
    }

    public void pop() {
        if(stack3.peek().equals(stack1.peek()))
        {
            stack1.pop();
        }
        stack3.pop();
    }

    public int top() {
        return stack3.peek();
    }

    public int getMin() {
        return stack1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
