class Solution(object):
    def maxFrequencyElements(self, nums):
        freq = {}
        final = 0
        max_freq = -1
        for i in nums:
            freq[i] = freq.get(i,0) + 1
            max_freq = max(max_freq,freq[i])
        for i,j in freq.items():
            if j == max_freq:
                final += j
        return final
            
         
        