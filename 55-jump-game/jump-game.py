class Solution:
    def canJump(self, nums: List[int]) -> bool:
        e = nums[0]
        for num in nums:
            if e < 0:
                return False
            if e<num:
                e=num
            e-=1
        return True