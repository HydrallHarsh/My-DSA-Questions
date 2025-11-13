class Solution(object):
    def canMakeArithmeticProgression(self, arr):
        prev = 0
        arr.sort()
        for i in range(len(arr)-1):
            print(arr[i])
            curr = abs(arr[i]-arr[i+1])
            if prev == curr or i==0:
                prev = curr
                continue
            else:
                return False
        return True
            
        