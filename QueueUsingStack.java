// Implention of QUEUE using Stack

import java.util.Stack;

class MyQueueLL {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueueLL() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // Add element to the queue
    public void enqueue(int x) {
        s1.push(x);
    }

    // Remove element from the queue
    public int dequeue() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Get front element
    public int peek() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Optional main for testing
    public static void main(String[] args) {
        MyQueueLL q = new MyQueueLL();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.peek()); // 1
        System.out.println(q.dequeue()); // 1
        System.out.println(q.empty()); // false
    }
}
