import java.util.Stack;
class MyQueue {
    Stack<Integer>stack1;//declaring the stack
    Stack<Integer>stack2;//declaring the stack

    public MyQueue() {//constructor method 
        stack1 = new Stack<>();//initialising the stack;
        stack2 = new Stack<>();//initialising the stack;
    }
    
    public void push(int x) {
        while(stack1.size()!=0)//first we will evacuate all the elements from stack1
        //then we will push the desired element into the stack1
        //and then we will fill the stack1 with stack2;
        {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(stack2.size()!=0)
        {
            int temp = stack2.pop();
            stack1.push(temp);
        }
    }
    public int pop() {
        return stack1.pop();//and rest all the methods are same;
    }
    
    public int peek() {
        return stack1.peek();
    }
    
    public boolean empty() {
        if(stack1.size()==0)
        {
            return true;
        }
        return false;
    }
}
