class Solution:
    def isPalindrome(self, s: str) -> bool:
        filtered = "".join(ch for ch in s.lower() if ch in "qwertyuiopasdfghjklzxcvbnm12345678990")
        return filtered == filtered[::-1]