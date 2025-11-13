class Solution(object):
    def shuffle(self, nums, n):
        t1 = nums[:n]
        t2 = nums[n:]
        new_nums = []
        for i in range(n):
            new_nums.append(t1[i])
            new_nums.append(t2[i])

        return new_nums
        