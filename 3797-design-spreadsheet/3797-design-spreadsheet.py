class Spreadsheet:
    def __init__(self, rows: int):
        self.spreadsheet = [[0 for _ in range(26)]for _ in range(rows)]
        return 
    def setCell(self, cell: str, value: int) -> None:
        self.spreadsheet[int(cell[1:])-1][ord(cell[0]) - ord('A')] = value

        return 
    def resetCell(self, cell: str) -> None:
        self.spreadsheet[int(cell[1:])-1][ord(cell[0]) - ord('A')] = 0

        return 
    def getValue(self, formula: str) -> int:
        
        new_f = formula[1:]
        # print(new_f)
        new_f = new_f.split("+")
        val = []
        for i in new_f:
            print(new_f)
            if i.isnumeric():
                val.append(int(i))
            elif i.isalnum():
                # print(i)
                rowth = ord(i[0]) - ord('A')
                colth = int(i[1:]) -1
                val.append(self.spreadsheet[colth][rowth])

        # print(val)
        return sum(val)
        

# Your Spreadsheet object will be instantiated and called as such:
# obj = Spreadsheet(rows)
# obj.setCell(cell,value)
# obj.resetCell(cell)
# param_3 = obj.getValue(formula)