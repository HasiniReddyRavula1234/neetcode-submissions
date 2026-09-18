# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        temp = list1
        curr = list2
        dummy = ListNode(0)
        node = dummy
        while temp and curr:
            if temp.val < curr.val:
                node.next = temp
                temp = temp.next
            else:
                node.next = curr
                curr = curr.next
            node = node.next
        if temp:
            node.next = temp
        if curr:
            node.next = curr
        return dummy.next
        

        