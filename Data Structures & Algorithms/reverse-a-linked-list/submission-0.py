# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return 
        temp = head
        prev = None
        curr = None
        while temp != None:
            curr = temp.next
            temp.next = prev
            prev = temp
            temp = curr
        return prev
