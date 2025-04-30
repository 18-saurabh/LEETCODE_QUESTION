import java.util.LinkedList;
import java.util.Queue;

public class LC_225 {
    private int size;

    public LC_225() {
        size = 0;
    }

    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        size = q.size();
        q.add(x);
        for (int i = 1; i <= size; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        if (q.isEmpty()) {
            System.out.println("Stack is overflow");
            return -1;
        }
        return q.remove();
    }

    public int top() {
        if (q.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
