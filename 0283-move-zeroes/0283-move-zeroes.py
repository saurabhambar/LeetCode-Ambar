class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        count = 0
        i=0
        for i in range(len(nums)):
            if nums[i] == 0:
                count+=1
            else:
                nums[i-count] = nums[i]
        nums[i-count+1:] = [0] * count
        return nums