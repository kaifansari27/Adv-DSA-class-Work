// implementation of Stack using Linkedlist...

public class StackUsingLL {

    // Node class for linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null; // top of the stack
    private int count = 0;   // number of elements in stack

    // Push operation
    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
        count++;
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        int val = top.data;
        top = top.next;
        count--;
        return val;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return top.data;
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Get stack size
    int size() {
        return count;
    }

    // Main method to test stack
    public static void main(String[] args) {
        StackUsingLL st = new StackUsingLL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display(); // 30 20 10
        System.out.println("Top: " + st.peek()); // 30
        st.pop();
        st.display(); // 20 10
        st.push(40);
        st.display(); // 40 20 10
        System.out.println("Size: " + st.size()); // 3
    }
}
