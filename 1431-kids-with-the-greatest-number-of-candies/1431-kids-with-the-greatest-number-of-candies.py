class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        l = len(candies)
        m = max(candies)

        res = []
        for i in range(0,l):
            if candies[i] + extraCandies >= m:
                res.append(True)
            else:
                res.append(False)
        return res
                
        