// reverse of the the LinkedList.....

import java.lang.classfile.components.ClassPrinter.ListNode;

public class LEETCODE_19 {
    public static void main(String[] args) {
        
    }
    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node banaya -> edge cases handle karne ke liye (jaise head delete karna ho)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Jab tak fast list ke end tak nahi pahunchta,
        // slow aur fast dono ko ek-ek step aage badhao
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Ab slow ke next me wahi node hai jo delete karni hai -> usko skip kar do
        slow.next = slow.next.next;

        // Updated head return karo
        return dummy.next;
    }
}
}
