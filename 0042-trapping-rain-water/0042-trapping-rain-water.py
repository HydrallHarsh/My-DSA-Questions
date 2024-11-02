class Solution:
    def trap(self, height: List[int]) -> int:
        
        l,r = 0, len(height)-1
        maxl,maxr = height[l] , height[r]
        amt = 0
        while(l<r):
            if(maxl < maxr):
                l+=1
                maxl = max(maxl,height[l])
                amt += maxl - height[l]
            else:
                r-=1
                maxr = max(maxr,height[r])
                amt += maxr - height[r]
                
        return amt
            

