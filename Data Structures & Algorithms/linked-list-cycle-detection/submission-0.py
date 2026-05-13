# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        seen = {}
        curr = head

        while curr:
            next_node = curr.next

            if curr in seen:
                return True
            else:
                seen[curr] = 1
            
            curr = next_node
        
        return False

        