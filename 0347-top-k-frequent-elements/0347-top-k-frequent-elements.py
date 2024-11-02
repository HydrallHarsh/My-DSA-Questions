class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        maps = {}
        for i in nums:
            maps[i] = 1+maps.get(i,0)
        temparr = []
        for key,value in maps.items():
            temparr.append([value,key])
        
        temparr.sort()

        ans = []
        while(len(ans)<k):
            ans.append(temparr.pop()[1])
        return ans