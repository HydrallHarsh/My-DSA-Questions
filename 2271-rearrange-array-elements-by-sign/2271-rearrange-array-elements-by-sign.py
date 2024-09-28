class Solution(object):
    def rearrangeArray(self, nums):
        posarr = []
        negarr = []
        newarr = []
        for i in nums:
            if(i<0):
                negarr.append(i)
            else:
                posarr.append(i)
        n = len(negarr)
        for j in range(0,n):
            newarr.append(posarr[j])
            newarr.append(negarr[j])
        return newarr