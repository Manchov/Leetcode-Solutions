
import java.util.List;

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
//    ListNode makeToNode(ListNode node,int sum){
//        while (sum>9){
//            node.val = sum%10;
//            ListNode node = new ListNode()
//            return makeToNode(new n,sum/10);
//        }
//        node.val = sum;
//        return null;
////    }
//    long getNumberFromList(ListNode l1){
//        if (l1.next != null) {
////            System.out.println(l1.val);
//            return +(getNumberFromList(l1.next)*10)+l1.val;
//        }
////        System.out.println(l1.val);
//        return l1.val;
//    }

    void calculate(ListNode l1, ListNode l2, ListNode node, int carry) {

        while ((l1 != null) || (l2 != null) || carry != 0) {
            System.out.println("-");
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            System.out.println("-" + sum);
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            System.out.println("-" + node.val);
            node = node.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

    }

//    ListNode makeToNode(ListNode node,int sum){
//        if (sum>9){
//            node.val = sum%10;
//            sum = sum/10;
//            System.out.println(node.val);
//            ListNode nodel = new ListNode(sum%10,makeToNode(node,sum));
////            node.next = nodel;
//            return nodel;
//        }
//        node.val = sum;
//        return node;
//    }
//    ListNode makeList(int sum){
//
//        if (sum > 9) {
//            ListNode next = new ListNode();
//            this.val = sum%10;
//            sum /=10;
//            next.next = makeList(sum);
//            this.next = next;
//            return next;
//        } else this.val=sum;
//        return this.next;
//    }

//    ListNode noder(long sum){
//        if (sum<10){
//            ListNode node = new ListNode((int)sum);
//            return node;
//        }
//        int digit = (int)(sum%10);
//        ListNode node = new ListNode(digit,noder(sum/10));
//        return node;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode n = new ListNode(0);
        //ListNode b = n;
        calculate(l1, l2, n, 0);
//        long n1 = getNumberFromList(l1);
//        long n2 = getNumberFromList(l2);
//        long sum = n1 + n2;
//        if (sum == 1410065399)
////            sum = 10000000000;
//        n = calculate(l1,l2,0)
//        makeToNode(n,sum);
//        //n = noder(sum);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(sum);
        //System.out.println(l1.getData());
        return n.next;
    }
}
