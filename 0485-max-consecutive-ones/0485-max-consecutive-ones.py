class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        res = 0
        cnt = 0
        for i in nums:
            if i == 1:
                cnt += 1
                res = max(cnt,res)
            if i == 0:
                cnt = 0
        return res