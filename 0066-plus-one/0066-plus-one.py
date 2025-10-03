class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        rev = digits[::-1]
        for i in range(n):
            if(rev[i] < 9):
                rev[i]+=1
                return rev[::-1]
            else:
                rev[i]=0
        rev.append(1)
        return rev[::-1]

