class Solution:
    def seive(self, ul):
        sieve = [True] * (ul + 1)
        sieve[0] = sieve[1] = False
        for i in range(2,int(math.sqrt(ul)) + 1):
            if sieve[i]:

                for j in range(i*i , ul+1,i):
                    sieve[j] = False
        return sieve
    def closestPrimes(self, left: int, right: int) -> List[int]:
        array = self.seive(right)
        pn = [
            num for num in range(left, right + 1) if array[num]
        ]
        if len(pn) < 2:
            return [-1,-1]
        min_diff = float("inf")
        cp = (-1,1)
        for i in range(1,len(pn)):
            diff = pn[i] - pn[i-1]
            if diff < min_diff:
                min_diff = diff
                cp = pn[i-1],pn[i]
        return cp