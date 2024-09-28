class Solution(object):
    def minPairSum(self, nums):
        nums.sort()
        l ,r = 0,len(nums)-1
        som = 0
        maxsum = float('-inf')
        while(len(nums) != 0):
            l ,r = 0,len(nums)-1
            som = nums[l] + nums[r]
            maxsum = max(som,maxsum)
            nums = nums[l+1:r]
        return maxsum

        