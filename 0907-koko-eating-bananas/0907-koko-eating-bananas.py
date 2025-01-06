class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        # speed = 1
        # max_p = max(piles)
        # for i in range(max_p):
        #     totime = 0
        #     for p in piles:
        #         totime = totime + (math.ceil(p/speed))
            
        #     if totime<= h:
        #         return speed
        #     speed += 1
        l , r = 1,max(piles)
        result = r
        
        while(l<=r):
            mid = (l+r)//2
            totime = 0
            for i in piles:
                totime += math.ceil(i/mid)
            if totime <= h:
                result = mid
                r = mid - 1
            else:
                l = mid + 1
        return result

        