
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
    private ListNode startNode;

    private boolean polindromeNodeChecker(ListNode node) {
        if (node != null) {
            if (!polindromeNodeChecker(node.next))
                return false;
            if (node.val != startNode.val)
                return false;
            startNode=startNode.next;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        startNode = head;
        return polindromeNodeChecker(head);
    }
}
