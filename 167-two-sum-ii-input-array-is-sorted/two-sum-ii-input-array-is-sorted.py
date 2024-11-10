class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        log = {}
        for i in range(len(numbers)):
            offset = target - numbers[i]
            if offset in log:
                return [log[offset]+1, i+1]
            log[numbers[i]] = i
        return []