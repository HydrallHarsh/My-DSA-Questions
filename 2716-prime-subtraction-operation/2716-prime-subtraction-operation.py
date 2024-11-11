class Solution:
    def primeSubOperation(self, nums: List[int]) -> bool:
        primes = [ ]
        n = 1000
        tf = [True for i in range(n)]
        p = 2
        while( p * p <= n):
            if(tf[p] == True):
                for i in range(p * p , n ,p):
                    tf[i] = False
            p += 1
        
        for p in range(2,n):
            if tf[p] == True:
                primes.append(p)
        # Just using Sieve of Eratostherns for Prime number list till 1000 O(log(logn)) for this

        # looping over nums checking for largest smallest prime number that make nums[i]
        # larger than its previous element but also reducing it to the smallest by taking
        # largest prime number matching the stricly incresing condition
        prev = 0
        for i in range(len(nums)):
            bound = nums[i] - prev
            lar = 0
            for j in reversed(range(2,bound)):
                if j in primes:
                    lar = j
                    break

            if (nums[i]-lar)<= prev:
                return False
            prev = nums[i] - lar
        return True