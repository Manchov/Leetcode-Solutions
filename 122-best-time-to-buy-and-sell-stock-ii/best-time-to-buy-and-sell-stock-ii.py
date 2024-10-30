class Solution:
    def maxProfit(self, prices: List[int]) -> int:        
        return sum(y-x for x,y in zip(prices, prices[1:]) if y>x)