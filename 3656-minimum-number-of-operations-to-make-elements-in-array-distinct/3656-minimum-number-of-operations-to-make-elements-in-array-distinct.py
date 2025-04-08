class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        count = 0
        temp = set(nums)
        if len(nums) == len(temp):
            return count
        while(len(nums)>0):
            if len(nums) == len(set(nums)):
                return count
            nums = nums[3:]
            count += 1
        return count