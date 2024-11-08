class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        ans = []
        xor = 0
        #Calculating XOR of the whole array nums
        for i in nums:
            xor = xor ^ i
        #Calculates the value of k that maximises the result of XOR of array
        maskedBits = (1 << maximumBit)-1
        
        for i in reversed(nums):
            ans.append(xor ^ maskedBits)
            #Removing Last element from the array
            xor = xor ^ i
        return ans