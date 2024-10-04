class Solution(object):
    def maxOperations(self, nums, k):
        nums.sort()
        l,r = 0,len(nums)-1
        pairs = 0
        while(l<r):
            if(nums[l] + nums[r] == k):
                pairs+=1
                l+=1
                r-=1
            elif(nums[l] + nums[r] < k):
                l+=1
            elif(nums[l] + nums[r] > k):
                r-=1
        return pairs
        