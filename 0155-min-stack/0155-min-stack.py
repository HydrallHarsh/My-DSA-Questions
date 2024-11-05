class MinStack:

    def __init__(self):
        self.arr = []

    def push(self, val: int) -> None:
        min_value = self.getMin()
        if min_value == None or min_value > val  :
            min_value = val
        self.arr.append([val,min_value])
    def pop(self) -> None:
        self.arr.pop()

    def top(self) -> int:
        if(len(self.arr) == 0):
            return None
        else:

            return self.arr[-1][0]

    def getMin(self) -> int:
        if(len(self.arr) == 0):
            return None
        else:
            return self.arr[-1][1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()