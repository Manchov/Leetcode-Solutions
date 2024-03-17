
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pred = new ListNode();
        ListNode start = new ListNode();
        start = head;
        Stack<ListNode> nodes = new Stack<ListNode>();
        int count = 0;
        while (head!=null){
            System.out.println(head.val);
            if (head.next==null)
                break;
            nodes.add(head);
//            pred = head
            head = head.next;
            count++;
//            System.out.println(head.val);
        }
        if (count==0&&n==1)
            return start=null;
        else if (count-n==-1) {
            return start.next;
        }

        while (n!=0){
            System.out.println("{- "+head.val);
            pred = head.next==null?null:head.next;
//            head = nodes.pop();
            head = nodes.empty()?new ListNode():nodes.pop();
            n--;
        }
//        head = nodes.pop();
        head.next = pred;
        return start;
        
    }
}
