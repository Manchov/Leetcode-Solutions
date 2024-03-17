
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int counter(ListNode node) {
        int counter = 0;
        while (node != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    public ListNode middleNode(ListNode head) {
        int counter = counter(head);
        int halfway = (int) Math.ceil(counter / 2);
        for (int i = 0; i < halfway; i++) {
            head = head.next;
        }
        return head;
    }
}
