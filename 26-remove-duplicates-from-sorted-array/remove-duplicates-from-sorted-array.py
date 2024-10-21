class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = len(nums)
        i, j = 0, 0
        p = nums[0]
        while i < l:
            if nums[i]!=p:
                j+=1
                nums[j]=nums[i]
                p=nums[i]
            i+=1
        return j+1