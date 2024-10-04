class Solution(object):
    def dividePlayers(self, skill):
        skill.sort()
        l,r = 0,len(skill)-1
        target = skill[l] + skill[r]
        ans = 0
        while(l<r):
            if(skill[l] + skill[r] == target):
                ans = ans+ (skill[l] * skill[r])
                
            elif(skill[l] + skill[r] != target):
                return -1
            l+=1
            r-=1
        return ans