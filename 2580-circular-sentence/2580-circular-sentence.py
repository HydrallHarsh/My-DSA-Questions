class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        l = sentence.split(' ')
        for i in range(0,len(l)):
            if(i == len(l)-1):
                if(l[i][-1] != l[0][0]):
                    return False
                else:
                    return True
            elif(l[i][-1] != l[i+1][0]):
                return False
            
        return True
