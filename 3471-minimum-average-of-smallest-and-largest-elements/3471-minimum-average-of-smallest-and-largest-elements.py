class Solution(object):
    def minimumAverage(self, nums):
        nums.sort()
        average = 0.0
        minavg = float('inf')
        while(len(nums) != 0):
            l,r = 0,len(nums) - 1
            average = (float)(nums[l]+nums[r])/2
            nums = nums[l+1:r]
            minavg = min(average , minavg)
        return minavg


            