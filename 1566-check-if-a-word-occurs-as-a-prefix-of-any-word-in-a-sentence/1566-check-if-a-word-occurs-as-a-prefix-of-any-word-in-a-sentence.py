class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        l = sentence.split(" ")
        # print(l)
        word = ""
        for i in range(len(l)):
            if l[i] == searchWord:
                return i+1
            for j in range(len(l[i])):
                if word == searchWord:
                    return i+1
                word += l[i][j]
                # print(word)
            word = ""
        
        return -1