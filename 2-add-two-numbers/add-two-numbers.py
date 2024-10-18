# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        c = 0
        node = root = ListNode(0)
        while l1 or l2 or c:
            if l1:
                c+=l1.val
                l1 = l1.next
            if l2:
                c+=l2.val
                l2 = l2.next
            c,val=divmod(c,10)
            node.next = ListNode(val)
            node = node.next
        return root.next