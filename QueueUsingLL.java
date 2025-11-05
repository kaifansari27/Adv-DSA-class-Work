// Implention of QUEUE using Stack Linked List
public class QueueUsingLL {

    // Node class for linked list
    private static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front = null; // Front se remove karte h
    private Node rear = null;  // rear par insert karte hhhhhhh...
    private int count = 0;     // initially number of elements is zeroooooo...

    // Enqueue (insert at rear)
    void enqueue(int x){
        Node newNode = new Node(x);
        if(isEmpty()){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    // Dequeue (remove from front)
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if(front == null) rear = null; // queue becomes empty
        count--;
        return val;
    }

    // Peek
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return front.data;
    }

    // Display queue
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean isEmpty(){ return front == null; }
    int size(){ return count; }

    // Main for testing
    public static void main(String[] args) {
        QueueUsingLL q = new QueueUsingLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // 10 20 30
        q.dequeue();
        q.display(); // 20 30
        q.enqueue(40);
        q.display(); // 20 30 40
        System.out.println("Peek: " + q.peek()); // 20
        System.out.println("Size: " + q.size()); // 3
    }
}
