class Solution:
    def reverseString(self, s: list[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        temp = s.copy()
        s.clear()
        s.extend(temp[::-1])
       
        