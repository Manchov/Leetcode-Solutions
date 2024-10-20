class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        l = len(nums)
        i = 0
        while i < l:
            if nums[i] == val:
                while i < l and nums[l-1] == val:
                    l-=1
                if i>=l:
                    break
                nums[i],nums[l-1] = nums[l-1],nums[i]
                l-=1
            i+=1
        return l