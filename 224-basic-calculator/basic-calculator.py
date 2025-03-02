class Solution:
    def calculate(self, s: str) -> int:
        signs = {
            '+': 1,
            '-': -1
        }
        number = 0
        calc = 0
        sign = 1
        level = []
        for char in s:
            if char.isdigit():
                number = number*10 + int(char)
            elif char in signs:
                calc += number*sign
                sign = signs[char]
                number = 0
            elif char == '(':
                level.append(calc)
                level.append(sign)
                calc = 0
                sign = 1
            elif char == ')':
                calc += number*sign
                calc *= level.pop()
                calc += level.pop()
                number = 0
        return calc+number*sign