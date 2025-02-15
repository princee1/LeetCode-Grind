class Solution:
    def isPalindrome(self, x: int) -> bool:
        x =str(x)
        end = len(x)
        stop = end//2
        
        return x[0:stop] == x[:stop-int(end%2==0):-1]

        