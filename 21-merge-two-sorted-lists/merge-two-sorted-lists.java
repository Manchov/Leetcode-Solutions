
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val)
                return node = new ListNode(list1.val, mergeTwoLists(list1.next, list2));
            else
                return node = new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }
        return list1==null? list2:list1;
    }
}
