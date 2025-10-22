// Queue Implemention Using Arrays

public class QueueImpemention {
    private int[] arr = new int[4];
    private int front = 0;
    private int rear = 0; // points to the next empty spot
    private int count = 0; // number of elements

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }
        arr[rear] = x;
        rear = (rear + 1) % arr.length;
        count++;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        count--;
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        for (int i = 0; i < count; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    boolean isEmpty() { return count == 0; }
    boolean isFull() { return count == arr.length; }
    int size() { return count; }
    int capacity() { return arr.length; }

    // main method must be inside the class
    public static void main(String[] args) {
        QueueImpemention q = new QueueImpemention();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30
        q.dequeue();
        q.display(); // 20 30
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Queue is Full!
        q.display(); // 20 30 40 50
        System.out.println(q.peek()); // 20
    }
}
