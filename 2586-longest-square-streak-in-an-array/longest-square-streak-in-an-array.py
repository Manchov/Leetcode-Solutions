class Solution:
    def longestSquareStreak(self, nums: List[int]) -> int:
        nums.sort()
        l:dict[int,int] = {}
        m = -1
        for x in nums:
            l[x]=1
            if (y:=math.sqrt(x)).is_integer():
                if y in l:
                    l[x]=l[y]+1
                    m = max(m,l[x])

        return m if m > 1 else -1