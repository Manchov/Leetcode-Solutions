class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        return True if goal in [s[i:]+s[:i] for i in range(0,len(s))] else False