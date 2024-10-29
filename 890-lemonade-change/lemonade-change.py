class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        types = {
            5:0,
            10:0,
            20:0,
        }
        for bill in bills:
            types[bill]+=1
            match bill:
                case 10:
                    if types[5]:
                        types[5]-=1
                    else:
                        return False
                case 20:
                    if types[10] and types[5]:
                        types[10]-=1
                        types[5]-=1
                    elif types[5]>=3:
                        types[5]-=3
                    else:
                        return False
        return True