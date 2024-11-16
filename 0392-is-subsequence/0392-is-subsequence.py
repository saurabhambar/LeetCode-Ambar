class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        l1 = len(s)
        l2 = len(t)
        if l1>l2: return False
        if l1 == 0: return True
        count = 0
        for i in range(l2):
            if count < l1:
                if s[count] == t[i]:
                    count+=1
        return count == l1
