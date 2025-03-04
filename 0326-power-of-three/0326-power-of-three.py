class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        def rec(k):
            if pow(3,k) == n:
                return True
            elif pow(3,k) > n:
                return False
            else:
                return rec(k+1)
        k = 0
        if n<=0:
            return False
        return rec(k)
            