class Solution:
    def compressedString(self, word: str) -> str:
        # maps= {}
        # comp = ""
        # tempword = list(word)
        # for i in range(len(tempword)):
        #     maps[tempword[i]] = 1 + maps.get(tempword[i],0)
        # for a,b in maps.items():
        #     if(b>9):
        #         remai = b%9
        #         quo = b//9
        #         for i in range(quo):
        #             comp += f"9{a}"
        #         comp += f"{remai}{a}"
        #     else: comp += f"{b}{a}"
        # return comp
        comp = ""
        templen = 1
        for i in range(0,len(word)):
            if i == len(word)-1:
                comp += f"{templen}{word[i]}"
            elif(word[i] == word[i+1]):
                templen += 1
                if(templen>9):
                    comp += f"9{word[i]}"
                    templen = 1
            
            else:
                
                comp += f"{templen}{word[i]}"
                templen = 1
            
        return comp