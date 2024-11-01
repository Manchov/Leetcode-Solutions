class Solution:
    def hIndex(self, citations: List[int]) -> int:
        citations.sort(reverse=True)
        nums = 0
        for cit in citations:
            if cit:
                if cit<nums:
                    return nums
                nums+=1
                if nums>=cit and cit:
                    return cit
        return nums