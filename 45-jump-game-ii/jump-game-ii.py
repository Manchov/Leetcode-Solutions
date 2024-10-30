class Solution:
    def jump(self, nums: List[int]) -> int:
        if len(nums) == 1: return 0
        jumps = 1
        pos = 0
        mx,mxi = 0,0
        while pos+nums[pos] < len(nums)-1:
            frame = nums[pos]
            for index,num in enumerate(nums[pos+1:pos+1+frame]):
                if num+(index-len(nums[pos+1:pos+1+frame]))>=mx:
                    mx = num+(index-len(nums[pos+1:pos+1+frame]))
                    mxi = index+1
            pos += mxi
            mx,mxi = 0,0
            jumps += 1

        return jumps