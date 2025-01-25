# Definition for singly-linked list.
"""
https://leetcode.com/problems/add-two-numbers/description/
"""
from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(
        self, l1: Optional[ListNode], l2: Optional[ListNode]
    ) -> Optional[ListNode]:
        self.sol = ListNode(0, None)
        sol = self.sol
        temp_ = None

       
        while l1 != None or l2 != None:
            val1 = l1.val if l1 != None else 0
            val2= l2.val if l2 != None else 0

            l1 = None if l1 is None else l1.next
            l2 = None if l2 is None else l2.next
            
            sum_ = val1 + val2
            sol.val += sum_ % 10
            sol.next = ListNode(int(sum_ >= 10 or sol.val >=10), None)
            sol.val%=10
            temp_=sol
            sol = sol.next
        
        if temp_.next.val ==0:
            temp_.next = None

        return self.sol
