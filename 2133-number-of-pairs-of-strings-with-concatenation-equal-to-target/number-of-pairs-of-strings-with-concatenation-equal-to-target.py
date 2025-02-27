class Solution:
    def numOfPairs(self, nums: List[str], target: str) -> int:
        combs = list(combinations(nums, 2))
        combs2 = list(combinations(nums[::-1], 2))
        realcombs = [''.join(x) for x in combs+combs2]
        return realcombs.count(target)