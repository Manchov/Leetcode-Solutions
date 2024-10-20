def rev(s) -> str:
    string = ""
    for c in s:
        if c == '1':
            string += '0'
        elif c == '0':
            string += '1'
    return string[::-1]


class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        s = '0'
        for i in range(n-1):
            s = s + '1' + rev(s)
        return s[k-1]
