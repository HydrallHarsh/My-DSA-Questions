class Solution(object):
    def twoSum(self, numbers, target):
        ans = []
        l = 0
        r = len(numbers) - 1
        while(l<r):
            if(numbers[l] + numbers[r] > target):
                # print(r)
                r = r-1
            elif(numbers[l] + numbers[r] < target):
                l = l+1
            else:
                return [l+1,r+1]
        return []
            