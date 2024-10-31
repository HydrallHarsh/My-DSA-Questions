class Solution(object):
    def twoSum(self, nums, target):
        maps = {}

        for i in range(len(nums)):
            maps[nums[i]] = i
        for i in range(len(nums)):
            pair = target - nums[i]
            if pair in maps and maps[pair] != i:
                return [i , maps[pair]]
        return []