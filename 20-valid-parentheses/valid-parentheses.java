class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char i :
                s.toCharArray()) {
            switch (i) {
                case '(':
                case '[':
                case '{':
                    stack.push(i);
                    break;
                case ')':
                    if (stack.isEmpty())
                        return false;
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    } else
                        return false;
                case ']':
                    if (stack.isEmpty())
                        return false;
                    if (stack.peek() == '[') {
                        stack.pop();
                        break;
                    } else
                        return false;
                case '}':
                    if (stack.isEmpty())
                        return false;
                    if (stack.peek() == '{') {
                        stack.pop();
                        break;
                    } else
                        return false;
                default:
                    return false;
            }
            //return false;

        }
        return stack.isEmpty();
    }
}
