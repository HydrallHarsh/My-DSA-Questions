class Solution(object):
    def minAddToMakeValid(self, s):
        count1 = 0
        count2 = 0
        for i in s :
            if(i == '('):
                count1 += 1
            elif(i == ')'):
                if(count1 >0 ):
                    count1 -=  1
                else:
                    count2 += 1
        return ( count1 + count2)