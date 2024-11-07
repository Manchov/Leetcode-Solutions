class Solution:
    def calc(self, n: int) -> int:
        res = 0
        while n > 0:
            res += (n % 10) ** 2
            n = n // 10
        return res

    def isHappy(self, n: int) -> bool:
        snail, rabbit = n, self.calc(self.calc(n))
        while snail != rabbit and rabbit != 1:
            snail, rabbit = self.calc(snail), self.calc(self.calc(rabbit))
        return rabbit == 1
