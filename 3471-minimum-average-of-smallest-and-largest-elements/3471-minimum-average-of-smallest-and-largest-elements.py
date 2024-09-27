class Solution(object):
    def minimumAverage(self, nums):
        nums.sort()
        average = 0.0
        n = len(nums)/2
        minavg = float('inf')
        l , r = 0,len(nums) - 1
        while(len(nums) != 0):
            l,r = 0,len(nums) - 1
            average = (float)(nums[l]+nums[r])/2
            
            # print(nums , len(nums)-1 ,l , r)
            nums = nums[l+1:r]
            minavg = min(average , minavg)
            # print(nums , len(nums)-1 , l,r,average,minavg)
        return minavg


            