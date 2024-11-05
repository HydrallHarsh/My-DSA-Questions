class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack = deque()
        oper = ["+","-","*","/"]
        for i in tokens:
            if(i not in oper):
                stack.append(int(i))
            elif(i in oper):
                first = stack.pop()
                second = stack.pop()
                if(i == "+"):
                    result = first + second
                elif(i == "-"):
                    result = second - first
                elif(i == "*"):
                    result = first * second
                else:
                    result = int(second / first)
                # print(result)
                stack.append(result)
                
        return stack[-1]