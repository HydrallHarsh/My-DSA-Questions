class Solution:
    def makeFancyString(self, s: str) -> str:
        ans = ""
        check = ''
        c = 0
        for i in s:
            if(i == check):
                c+=1
            else:
                c = 1
                check = i
            if(c>2):
                continue
            ans += i
        return ans