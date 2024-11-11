class Solution(object):
    def mergeAlternately(self, word1, word2):
        l1 = len(word1)
        l2 = len(word2)
        big = word2 if l1 < l2 else word1  
        
        if l1 == 0:
            return word2
        if l2 == 0:
            return word1
        
        s = ''
        
        for i in range(min(l1, l2)):
            s += word1[i] + word2[i]
    
        s += big[min(l1, l2):]
        
        return s
