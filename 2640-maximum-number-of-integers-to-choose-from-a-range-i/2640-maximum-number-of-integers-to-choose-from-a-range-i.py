class Solution:
    def maxCount(self, banned: List[int], n: int, maxSum: int) -> int:
        ban = set(banned)
        calcSum = 0
        k = 0
        for i in range(1,n+1):
            if i in ban:
                continue
            calcSum += i
            if calcSum > maxSum:
                return k
            k+=1
        return k
