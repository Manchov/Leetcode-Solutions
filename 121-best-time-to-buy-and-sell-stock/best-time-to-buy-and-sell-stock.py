class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        return max(j-i for j,i in zip(prices,accumulate(prices,min)))
        