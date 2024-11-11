class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        left = sum_nums = 0
        mini = len(nums)+1
        for i in range(len(nums)):
            sum_nums += nums[i]
            while sum_nums >= target and left <= i:
                diff = (i+1) - left
                mini = min(mini,diff)
                sum_nums -= nums[left]
                left+=1

        return mini if mini != (len(nums)+1) else 0
