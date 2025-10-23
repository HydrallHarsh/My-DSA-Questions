class Solution(object):
    def hasSameDigits(self, s):
        while(len(s)>2):
            new_s = ""
            for i in range(len(s)-1):
                temp = (int(s[i])+int(s[i+1]))%10
                new_s += str(temp)
            s = new_s
        if s[0] == s[1]:
            return True
        else:
            return False
        