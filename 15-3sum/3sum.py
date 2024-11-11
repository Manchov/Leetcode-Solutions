class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:        
        nums.sort()
        n = len(nums)
        result = []

        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left, right = i + 1, n - 1
            while left < right:
                total = nums[i] + nums[left] + nums[right]
                if total == 0:
                    result.append([nums[i], nums[left], nums[right]])
                    left += 1
                    right -= 1

                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1

                elif total < 0:
                    left += 1
                else:
                    right -= 1

        return result
        # return [sorted(x) for x in set(combinations(nums, 3)) if sum(x) == 0] # Memory exceeded exception
        # return [list(x) for x in {tuple(sorted(x)) for x in combinations(nums, 3) if sum(x) == 0}] #Timeout Exception