class Solution:
    def primeSubOperation(self, nums: List[int]) -> bool:
        primes=[True]*1001
        primes[0]=primes[1]=False

        for i in range(2,(len(primes))):
            if primes[i]:
                for j in range(i*i, (len(primes)), i):
                    primes[j] = False

        i = 0
        prev = 1
        while i < (len(nums)):
            dif = nums[i]-prev
            if dif<0:
                return False
            if primes[dif]==True or dif == 0:
                i+=1
                prev+=1
            else:
                prev+=1
        return True

        # print(list(enumerate(primes)))