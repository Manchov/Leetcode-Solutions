# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        snail, rabbit = head, head
        while rabbit and rabbit.next:
            snail, rabbit = snail.next, rabbit.next.next
            if rabbit == snail:
                return True
        return False