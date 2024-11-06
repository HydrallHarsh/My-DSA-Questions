class Solution:
    def canSortArray(self, nums: List[int]) -> bool:
        n = len(nums)
        val = nums.copy()

        for i in range(n):
            for j in range(n-i-1):
                if(val[j]< val[j+1]):
                    continue
                if bin(val[j]).count("1") == bin(val[j+1]).count("1"):
                    val[j] , val[j+1] = val[j+1] , val[j]
                else:
                    return False
        return True