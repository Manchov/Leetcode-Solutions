class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        l = [ch for ch in t if ch in s]
        i, j = 0, 0
        while i < len(s) and j < len(l):
            if s[i] == l[j]:
                i += 1
            j += 1
        return i == len(s)
        # return s in "".join([ch for ch in t if ch in s]).replace(" ", "")