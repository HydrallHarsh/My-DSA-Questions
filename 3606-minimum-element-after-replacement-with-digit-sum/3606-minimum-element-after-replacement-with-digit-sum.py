class Solution(object):
    def minElement(self, nums):
        for i in range(0,len(nums)):
            n = nums[i]
            som = 0
            while(n>0):
                r = n %10
                som += r
                n = n/10
            nums[i] = som
        return min(nums)
        