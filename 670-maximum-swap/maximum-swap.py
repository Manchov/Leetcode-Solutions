def getdigit(num, n):
    return int(num//10**n%10)


class Solution:
    def maximumSwap(self, num: int) -> int:
        dig = int(math.log10(num)+1)
        flag = False
        for i in range(dig-1,-1,-1):
            bigger = getdigit(num,i)
            for j in range(i-1,-1,-1):
                ldigit = getdigit(num,i)
                rdigit = getdigit(num,j)
                if (rdigit>ldigit and rdigit>=bigger):
                    bigger = rdigit if rdigit>bigger else bigger
                    swap = (i,j)
                    nums = (ldigit,rdigit)
                    flag = True
            if flag:
                posl,posr = swap
                numl,numr = nums
                x = (numr * 10 ** posr) - (numl * 10 ** posr)
                y = (numl * 10 ** posl) - (numr * 10 ** posl)
                num = num-x-y
                return num
        return num