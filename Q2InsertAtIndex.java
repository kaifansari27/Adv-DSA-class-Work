// insert At index in Linkedlist....

public class Q2InsertAtIndex {
    static Node head;

    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

     
    public static void insertAt(int idx, int val) {
        Node t = new Node(val);

        if (idx == 0) { // insert at head
            t.next = head;
            head = t;
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Before Insertion:");
        printList();

        insertAt(3, 5); // insert 5 at index 3
        System.out.println("After Insertion:");
        printList();
    }
}
