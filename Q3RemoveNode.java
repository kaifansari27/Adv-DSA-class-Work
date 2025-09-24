public class Q3RemoveNode {
    static Node head;

    public static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    // remove node with given value
    public static void remove(int val) {
        if (head == null) return;

        if (head.data == val) {
            head = head.next; // if head is to be deleted
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next; // skip the node
        }
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
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(4);

        System.out.println("Before Removal:");
        printList();

        remove(5); // remove node with value 5
        System.out.println("After Removal:");
        printList();
    }
}
