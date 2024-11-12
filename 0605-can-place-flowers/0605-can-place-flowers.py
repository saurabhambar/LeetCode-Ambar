class Solution(object):
    def canPlaceFlowers(self, A, n):
        """
        :type flowerbed: List[int]
        :type n: int
        :rtype: bool
        """
        A = [0] + A + [0]
        l = len(A)
        x=0
        for i in range(1,l-1):
            if A[i]==1:
                continue
            if not A[i-1] + A[i+1]:
                A[i] = 1
                x+=1
        return x>=n