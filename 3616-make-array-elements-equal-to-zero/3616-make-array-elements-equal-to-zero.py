class Solution(object):
    def countValidSelections(self, nums):
        #taking all 0 positions in an array first 
        n = len(nums)
        nums1 = nums[:]
        comp_nums = []
        l = []
        res = 0
        for i in range(len(nums)):
            comp_nums.append(0)
            if nums[i] == 0:
                l.append(i)
        # print(l)
        for curr in l:
            # print("============NEW========================")
            # print(nums,nums1)
            nums1 = nums[:]
            curr_cp = curr
            t = 1
            while(0 <= curr_cp < n):
                # print("initi:",curr_cp)
                if(nums1[curr_cp] == 0):
                    curr_cp += t
                    # print("o comp:",curr_cp,nums1)
                elif(nums1[curr_cp]>0):
                    nums1[curr_cp] -= 1
                    t = t *(-1)
                    curr_cp += t
                    # print(">o comp:",curr_cp,nums1)
            # print("loop1", nums1)
            if(nums1 == comp_nums): res += 1
            nums1 = nums[:]
            curr_cp = curr
            t = -1
            while(0 <= curr_cp < n):
                if(nums1[curr_cp] == 0):
                    curr_cp += t
                elif(nums1[curr_cp]>0):
                    nums1[curr_cp] -= 1
                    t *= (-1)
                    curr_cp += t
            # print("loop2", nums1)
            if(nums1 == comp_nums): res += 1
        return res