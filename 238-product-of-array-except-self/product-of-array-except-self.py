class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = 1
        right = 1
        results = [1] * len(nums)
        for i in range(len(nums)):
            results[i] *= left
            left *= nums[i]
            results[len(nums) - i - 1] *= right
            right *= nums[len(nums) - i - 1]
        return results