class Solution(object):
    def mergeAlternately(self, word1, word2):
        l1 = len(word1)
        l2 = len(word2)
        if l1 == 0:
            return word2
        if l2 == 0:
            return word1
        s=''
        i=0
        j=0
        k=0
        while (i < l1) and (j < l2):
            if k%2==0:
                s=s+word1[i]
                i+=1
                k+=1
            else:
                s=s+word2[j]
                j+=1
                k+=1      
        while (i < l1):
            s=s+word1[i] 
            i+=1
        while (j < l2):
            s=s+word2[j]
            j+=1
        return s