class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        text_list = text.split(" ")
        cout = len(text_list)
        for i in text_list:
            for j in i:
                if j in brokenLetters:
                    cout -= 1
                    break
        return cout