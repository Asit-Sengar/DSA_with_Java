import java.util.ArrayDeque;//ArrayDeque is the concrete class of deque interface;
import java.util.Deque;//deque is the interface;
class MyStack {
    /*here Mystack is the constructor of Mystack class */
    Deque<Integer>dq;//here i am only declaring it;
    public MyStack() {
        dq = new ArrayDeque<>();//initialising it;
    }
    
    public void push(int x) {
        dq.addLast(x);
    }
    
    public int pop() {
       return dq.removeLast();
    }
    
    public int top() {
        return dq.peekLast();
    }
    
    public boolean empty() {
        int size = dq.size();
        if(size==0)
        {
            return true;
        }
        return false;
    }
}
