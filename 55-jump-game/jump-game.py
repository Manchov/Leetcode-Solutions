class Solution:
    def canJump(self, nums: List[int]) -> bool:
        e = nums[0]
        for i,num in enumerate(nums):
            if e < 0:
                return False
            if e<num:
                e=num
            e-=1
        return True