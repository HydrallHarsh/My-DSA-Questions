class Solution:
    def countSubstrings(self, s: str) -> int:
        l = []
        n = len(s)
        for i in range(n):
            for j in range(n):
                temp = s[i:j+1]
                if(temp == temp[::-1] and temp != ""):
                    l.append(temp)

        return len(l)