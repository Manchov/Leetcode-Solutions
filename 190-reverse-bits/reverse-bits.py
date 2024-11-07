class Solution:
    def reverseBits(self, n: int) -> int:
        return int(('%32s'%str(bin(n)[2:])).replace(' ',"0")[::-1], 2)