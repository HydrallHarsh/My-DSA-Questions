class Solution(object):
    def minimumOperations(self, nums):
        operations = 0
        for i in nums:
            if(i % 3 != 0):
                operations += 1
        return operations 
        