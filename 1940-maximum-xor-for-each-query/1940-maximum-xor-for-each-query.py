class Solution:
    def getMaximumXor(self, nums: List[int], maximumBit: int) -> List[int]:
        ans = []
        xor = 0
        for i in nums:
            xor = xor ^ i
        maskedBits = (1 << maximumBit)-1
        
        for i in reversed(nums):
            ans.append(xor ^ maskedBits)
            xor = xor ^ i
        return ans