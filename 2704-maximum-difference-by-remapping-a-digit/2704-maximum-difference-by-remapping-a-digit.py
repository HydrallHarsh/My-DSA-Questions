class Solution:
    def minMaxDifference(self, num: int) -> int:
        num_s_max = str(num)
        num_s_min = str(num)
        first_max_num = ''
        first_min_num = ''
        for i in num_s_max:
            if i != '9':
                first_max_num = i
                break
        for i in num_s_min:
            if i != '0':
                first_min_num = i
                break
        if(first_min_num != '' and first_max_num != ''):
            num_s_max = num_s_max.replace(first_max_num,'9')
            num_s_min = num_s_min.replace(first_min_num,'0')
            num_s_max = int(num_s_max)
            num_s_min = int(num_s_min)

            return num_s_max-num_s_min
        return num