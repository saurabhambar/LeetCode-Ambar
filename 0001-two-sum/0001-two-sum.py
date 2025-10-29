class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # l = []
        # n = len(nums)
        # for i in range(n):
        #     for j in range(i+1,n):
        #         if (nums[i] + nums[j] == target):
        #             l.append(i)
        #             l.append(j)
        #             return l

        num_map = {}
        for i,num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement],i]
            num_map[num] = i 
        