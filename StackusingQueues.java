import java.util.LinkedList;
import java.util.Queue;

class MyStackLL {
    private Queue<Integer> q;

    public MyStackLL() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x); // add new element
        int size = q.size();
        // Rotate previous elements behind the new element
        for(int i = 0; i < size - 1; i++){
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        return q.poll(); // remove top element
    }
    
    public int top() {
        return q.peek(); // get top element
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    // Optional: main for testing
    public static void main(String[] args) {
        MyStackLL stack = new MyStackLL();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top()); // 2
        System.out.println(stack.pop()); // 2
        System.out.println(stack.empty()); // false
    }
}
