class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        maps = {}
        ans = []
        for s in strs:
            temp = list(s)
            temp.sort()
            temps = ''.join(temp)
            
            if(maps.get(temps)!=None):
                maps[temps].append(s)
            else:
                maps[temps] = []
                maps[temps].append(s)

        for a in maps.values():
            ans.append(a)
        return ans

