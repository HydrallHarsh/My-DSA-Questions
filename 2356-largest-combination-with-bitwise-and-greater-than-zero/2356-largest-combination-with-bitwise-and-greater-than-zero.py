class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        ans = [0] * 32
        for n in candidates:
            i = 0
            while (n>0):
                ans[i] += 1 & n
                i += 1
                n  = n >> 1
                
        return max(ans)