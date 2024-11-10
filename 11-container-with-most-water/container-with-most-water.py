class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxy = 0
        left,right = 0, len(height) - 1
        while left < right:
            maxy=max(maxy,min(height[left],height[right])*(right-left))
            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        return maxy
        # return max(min(x[0][1],x[1][1])*(x[1][0]-x[0][0]) for x in list(combinations(list(enumerate(height)),2)))
        